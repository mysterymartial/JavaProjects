package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @BeforeEach
    public void setUp() {
        diary = new Diary("bola","correct_pin");

    }
    @Test
    public void testThatTheDiaryIsEmpty(){
        assertTrue(diary.isEmpty());
    }
    @Test
    public void testThatDiaryCanBeLocked(){
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThatDiaryCanBeUnlocked(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unLock("correct_pin");
        assertFalse(diary.isLocked());
    }
    @Test
    public void testThatWhenYouCreateEntriesIsNotEmpty(){
        diary.unLock("correct_pin");
        diary.add("title","body");
        assertFalse(diary.isEmpty());
    }
    @Test
    public void testThatYouCantAddAnEntryToALockedDiary(){
        diary.lock();
        diary.add("title","body");
        assertTrue(diary.isEmpty());

    }
    @Test
    public void testThatTheSizeIncreasesPerEntries(){
        diary.unLock("correct_pin");
        diary.add("title","body");
        diary.add("title2","body2");
        assertEquals(2,diary.entriesSize());
    }
    @Test
    public void testThatYouCanRetriveEntriesFromTheUnlockedDiary(){
        diary.unLock("correct_pin");
        diary.add("title","body");
        diary.add("title2","body2");
        assertEquals("title",diary.findEntryTitleById(1));
    }
    @Test
    public void testThatYouCantRetriveEntryFromLockedDiary(){
        diary.lock();
        diary.add("title","body");
        diary.add("title2","body2");
        assertEquals("Diary is locked",diary.findEntryTitleById(2));
    }
    @Test
    public void testThatYouCantUpdateAnEntry(){
        diary.unLock("correct_pin");
        diary.add("Old Title","Old Body");
        boolean updatedEntry = diary.upadteEntry(1,"New Title","New Body");
        assertTrue(updatedEntry);
        String updatedTitle = diary.findEntryTitleById(1);
        assertEquals("New Title",updatedTitle);

    }
    @Test
    public void testThatYouCantUpadateALockedDiary(){
        diary.lock();
        diary.add("Old Title","Old Body");
        boolean updatedEntry = diary.upadteEntry(1,"New Title","New Body");
        assertFalse(updatedEntry);


    }
    @Test
    public void testToUpdateNonExistingEntry(){
        diary.unLock("correct_pin");
        boolean upadteEntry = diary.upadteEntry(1,"New Title","New Body");
        assertFalse(upadteEntry);
    }
    @Test
    public void testThatYouCanDeleteAnEntryFromAnUnlockedDiary(){
        diary.unLock("correct_pin");
        diary.add("Title","Body");
        boolean deleted = diary.deleteEntry(1);
        assertTrue(deleted);
        String deletedTitle = diary.findEntryTitleById(1);
        assertNull(deletedTitle);
    }
    @Test
    public void testThatYouCantDeleteAnEntryFromLockedDiary(){
        diary.lock();
        diary.add("Title","Body");
        boolean deleted = diary.deleteEntry(1);
        assertFalse(deleted);

    }
    @Test
    public void testThatYouCantANonExistingEntryFromAnUnlockedDiary(){
        diary.unLock("correct_pin");
        boolean deleted = diary.deleteEntry(1);
        assertFalse(deleted);
    }
    @Test
    public void testThatDiariesCanAddDiaryIntoItself(){
        diary.unLock("correct_pin");
        diary.add("title","body");
        diary.add("title2","body2");
        assertEquals(2,diary.entriesSize());
    }
    @Test
    public void testThatDirayCanBeFoundByUserNameInDiaries(){
        Diaries diaries = new Diaries();
        diaries.addDiary("Mike","1234");
        Diary foundDiary = diaries.findByUserName("Mike");
        assertNotNull(foundDiary);
        assertEquals("Mike",foundDiary.getName());
        Diary unFoundDiary = diaries.findByUserName("non-existent");
        assertNull(unFoundDiary);


    }
    @Test
    public void testThatDiariesCanDeleteDiary(){
        Diaries diaries = new Diaries();
        diaries.addDiary("Mike","1234");
        assertEquals(1,diaries.countDiaries());
        diaries.deleteDiary("Mike","1234");
        assertEquals(0,diaries.countDiaries());
    }

    }



