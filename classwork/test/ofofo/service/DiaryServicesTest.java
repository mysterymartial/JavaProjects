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
//    @Test
//    public void testMutipleRegistrationControlMechanism() {
//        diaryServices.register("alice","correct_password");
//        int diaryId =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
//        diaryServices.register("alice","correct_password");
//        in
//
//    }

    @Test
    public void testtoAddAnEntryToDiary() {
        diaryServices.register("alice","correct_password");
        int diaryId =((DiaryServiceImplementation)diaryServices).getCurrentDiaryId();
        Entry entry = new Entry("First Title", "First Body");
        diaryServices.addEntry(diaryId,entry);
        assertEquals(1,diaryServices.getDiaryById().getEntries().size);
    }
}
