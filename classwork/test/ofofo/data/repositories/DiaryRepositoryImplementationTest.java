package ofofo.data.repositories;

import models.Diary;
import models.Entry;
import org.junit.jupiter.api.Test;
import repositories.DiaryRepositoryImplementation;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplementationTest {
    private DiaryRepositoryImplementation repo;

    @BeforeEach
    public void setUp() throws Exception {
        repo = new DiaryRepositoryImplementation();


    }
    @Test
    public void testtoSaveEntriesInDBAndCheckIfTheSaveMethodUpdates() throws Exception {
        Diary diary = new Diary("alice","nak");
        repo.save(diary);
        assertNotNull(repo.findUserName("alice"));
        diary.setPassword("fuck");
        repo.save(diary);
        assertNotNull(repo.findUserName("alice"));
        assertEquals("fuck", repo.findUserName("alice").getPassword());

    }
    @Test
    public void testfindUserName() throws Exception {
        repo.save(new Diary("alice","nak"));
        Diary foundDiary = repo.findUserName("alice");
        assertEquals("alice", foundDiary.getUserName());

    }
    @Test
    public void test() throws Exception {
        repo.save(new Diary("biko","nak"));
        repo.deleteByUserName("biko");
        assertNull(repo.findUserName("biko"));
    }

    @Test
    public void testUpdateEntriesInTheDiary() throws Exception {
        Diary diary = new Diary("alice","nak");
        diary.setdiaryId("1");
        Entry entry = new Entry(1,"Boy Friend","i dont love that girl");
        List<Entry> entries = new ArrayList<>();
        entries.add(entry);
        diary.setEntries(entries);
        repo.save(diary);
        repo.updateEntry("1",1,"Girl Friend","i love that girl");
        Entry updatededEntry = repo.getByDiaryIdAndEntryId(1,"1");
        assertNotNull(updatededEntry);
        assertEquals("Girl Friend",updatededEntry.getTitle());
        assertEquals("i love that girl",updatededEntry.getBody());
    }
    @Test
    public void testFindBYDiaryIdAndEntryIdFound() {
        Diary diary = new Diary("alice","nak");
        diary.setdiaryId("1");
        Entry entry1 = new Entry(1,"my boy","i love you");
        Entry entry2 = new Entry(2,"my girl","i love you");
        List<Entry> entries = new ArrayList<>();
        entries.add(entry1);
        entries.add(entry2);
        diary.setEntries(entries);
        repo.save(diary);
        Entry result = repo.getByDiaryIdAndEntryId(1,"1");
        assertNotNull(result);
        assertEquals("my boy",result.getTitle());
    }
    @Test
    public void testFindByDiaryIdAndEntryId()  {
        Diary diary = new Diary("alice","nak");
        diary.setdiaryId("1");
        Entry entry1 = new Entry(1,"my boy","i love you");
        Entry entry2 = new Entry(2,"my girl","i love you");
        List<Entry> entries = new ArrayList<>();
        entries.add(entry1);
        entries.add(entry2);
        diary.setEntries(entries);
        repo.save(diary);
        Entry result = repo.getByDiaryIdAndEntryId(999,"1");
        assertNull(result);
        Entry result2 = repo.getByDiaryIdAndEntryId(1,"999");
    }
    @Test
    public void testToFindAllEntriesInADiary()  {
            Diary diary1 = new Diary("alice","nak");
            diary1.setdiaryId("1");
            Diary diary2 = new Diary("Fat Boy","suck");
            diary2.setdiaryId("2");
            Entry entry1 = new Entry(1, "First Title", "First Body");
            Entry entry2 = new Entry(2, "Second Title", "Second Body");
            diary1.setEntries(List.of(entry1, entry2));
            Entry entry3 = new Entry(3, "Third Title", "Third Body");
            diary2.setEntries(List.of(entry3));
            repo.save(diary2);
            repo.save(diary1);
            List <Entry> diary1Entries = repo.FindAllEntriesInADiary("1");
            assertEquals(2, diary1Entries.size());
            assertTrue(diary1Entries.contains(entry1));
            assertTrue(diary1Entries.contains(entry2));
            List <Entry> diary2Entries = repo.FindAllEntriesInADiary("2");
            assertEquals(1, diary2Entries.size());
            assertTrue(diary2Entries.contains(entry3));
            List <Entry> entryNotExisting = repo.FindAllEntriesInADiary("3");
            assertTrue(entryNotExisting.isEmpty());
    }
    @Test
    public void testDeleteDiaryByDiaryId(){
        Diary diary = new Diary("alice","nak");
        diary.setdiaryId("1");
        repo.save(diary);
        repo.deleteDiaryWithId("1");
        assertNull(repo.findUserName("alice"),"the diary shoild be null after deletion ");


    }
    @Test
    public void testDeleteDiaryByDiaryIdIfTheDiaryDoesNotExist(){
        repo.deleteDiaryWithId("non_existing");
        assertNull(repo.findByDiaryId("non_existing").orElse(null),"Diary should be null ");

    }
    @Test
    public void testDeleteAllEntriesInADiary() {
        Diary diary = new Diary("alice", "nak");
        diary.setdiaryId("1");
        Entry entry1 = new Entry(1, "my boy", "I love you");
        Entry entry2 = new Entry(2, "my girl", "I love you");
        diary.setEntries(Arrays.asList(entry1, entry2));
        repo.save(diary);
        assertFalse(repo.FindAllEntriesInADiary("1").isEmpty(), "Entries should exist before deletion.");
        repo.deleteAllEntries("1");
        List<Entry> entriesAfterDeletion = repo.FindAllEntriesInADiary("1");
        assertNotNull(repo.findByDiaryId("1").orElse(null), "Diary should still exist after entries are deleted.");
        assertTrue(entriesAfterDeletion.isEmpty(), "All entries should be deleted.");
    }



}
