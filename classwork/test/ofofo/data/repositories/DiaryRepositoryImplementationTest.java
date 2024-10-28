package ofofo.data.repositories;

import models.Diary;
import org.junit.jupiter.api.Test;
import repositories.DiaryRepositoryImplementation;
import org.junit.jupiter.api.BeforeEach;

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
    public void testDeleteByTitle() throws Exception {
       Diary diary = new Diary("alice","nak");
       diary.setTitle("Boyfriend");
       diary.setDescription("i kissed that stupid boy");
       repo.save(diary);
       repo.deleteByTitle("Boyfriend");
       assertNull(repo.findUserName("alice"));

    }
    @Test
    public void testUpdateEntriesInTheDiary() throws Exception {
        Diary diary = new Diary("alice","nak");
        diary.setTitle("Boyfriend");
        diary.setDescription("i kissed that stupid boy");
        repo.save(diary);
        repo.updateEntry(diary.getId(),"upadate title","upadated body");
        Diary foundDiary = repo.findUserName("alice");
        assertEquals("upadate title", foundDiary.getTitle());
        assertEquals("upadated body", foundDiary.getDescription());
    }
}
