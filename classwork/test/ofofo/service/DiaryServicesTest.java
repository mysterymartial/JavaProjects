package ofofo.service;

import models.Diary;
import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.DiaryServiceImplementation;
import service.DiaryServices;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServicesTest {
    private DiaryServices diaryServices;

    @BeforeEach
    public void setUp() {
        diaryServices = new DiaryServiceImplementation();



    }
    @Test
    public void testRegisterDiaryAccount() {
         diaryServices.register("alice","correct_password");
         int diaryId =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
         assertTrue(diaryId > 0);

    }
    @Test
    public void testMutipleRegistrationControlMechanism() {
        diaryServices.register("alice","correct_password");
        assertThrows(IllegalArgumentException.class, ()->diaryServices.register("alice","correct_password"));

    }
    @Test
    public void testThatICanRegisterMultipleUsers() {
        diaryServices.register("alice","correct_password");
        int diaryId1 =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
        assertTrue(diaryId1 > 0);
        diaryServices.register("john","correct_password");
        int diaryId2 =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
        assertTrue(diaryId2 > 0);
    }

//   @Test
//    public void testtoAddAnEntryToDiary() {
//        diaryServices.register("alice","correct_password");
//        int diaryId =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
//        Entry entry = new Entry("First Title", "First Body");
//        diaryServices.addEntry(diaryId,entry);
//        assertEquals(1,diaryServices.getdiaryById(diaryId).getEntries().size);
//    }
}
