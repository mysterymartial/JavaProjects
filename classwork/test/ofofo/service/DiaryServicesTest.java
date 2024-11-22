package ofofo.service;

import models.Diary;
import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.DiaryServiceImplementation;
import service.DiaryServices;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServicesTest {
    private DiaryServiceImplementation diaryServices;

    @BeforeEach
    public void setUp() {
        diaryServices = new DiaryServiceImplementation();
    }
    @Test
    public void testIfRegistrationIsSuccessful() {
        assertEquals("Diary registered successfully", diaryServices.register("testUser","pass1234"));

    }
    @Test
    public void testIfRegistrationIsNotSuccessful() {
        diaryServices.register("testUser","pass1234");
        Exception expection = assertThrows(IllegalArgumentException.class, () -> diaryServices.register("testUser","pass1234"));
        assertEquals("Username already exists", expection.getMessage());

    }
    @Test
    public void testIfLoginIsSuccessful() {
        diaryServices.register("testUser","pass1234");
        assertEquals("Login successfully", diaryServices.login("testUser","pass1234"));
    }
    @Test
    public void testIfLoginIsNotSuccessful() {
        diaryServices.register("testUser","pass1234");
        Exception expection = assertThrows(IllegalArgumentException.class, () -> diaryServices.login("testUser","pass123"));
        assertEquals("Invalid username or password", expection.getMessage());
    }
    @Test
    public void testIfTheUserHaveLogoutSuccessfully() {
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
        assertEquals("Logout successfully", diaryServices.logout());
    }
    @Test
    public void testUnSuccessfulLogout() {
        diaryServices.register("testUser","pass1234");
        assertEquals("No user is currently logged in", diaryServices.logout());
    }
    @Test
    public void testThatDiaryCanAddEntrySuccessfully() {
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
        assertEquals("Entry Successfully Created", diaryServices.addEntryInDiary("testUser","title","body"));

    }
    @Test
    public void testThatDiaryCannotAddEntryToInvalidUserDiary() {
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diaryServices.addEntryInDiary("test","title","body"));
        assertEquals("Entries cannot be added to invalid diary", exception.getMessage());

        diaryServices.register("testUser2","pass1234");
        assertThrows(IllegalArgumentException.class, () -> diaryServices.addEntryInDiary("testUser2","title","body"));
    }
    @Test
    public void testThatDiaryCanUpdateEntrySuccessfully() {
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
        diaryServices.addEntryInDiary("testUser","title","body");
        assertEquals("Entry Successfully Updated", diaryServices.updateEntryInDiary("testUser","New Tittle","New Body"));

    }
    @Test
    public void testThatInvalidDiaryCannotUpdateEntryToInvalidUserDiary() {
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
       assertEquals("Entry Successfully Created",diaryServices.addEntryInDiary("testUser","title","body"));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diaryServices.updateEntryInDiary("test","New Tittle","New Body"));
        assertEquals("Entries cannot be updated , invalid diary", exception.getMessage());

       diaryServices.register("testUser2","pass1234");
       Exception exception1 = assertThrows(IllegalArgumentException.class, () -> diaryServices.updateEntryInDiary("testUser2","New title" ,"new body"));
       assertEquals("Entries cannot be updated , invalid diary", exception1.getMessage());
    }
    @Test
    public void testThatDiaryReconizesesEachUserByUserName(){
        diaryServices.register("testUser","pass1234");
        Diary retrivedDiary = diaryServices.getDiaryByUserName("testUser");
        assertNotNull(retrivedDiary);
        assertEquals("testUser",retrivedDiary.getUserName());
    }
    @Test
    public void testTogetAllEntriesInTheDiary(){
        diaryServices.register("testUser","pass1234");
        diaryServices.login("testUser","pass1234");
        diaryServices.addEntryInDiary("testUser","title","body");
        diaryServices.addEntryInDiary("testUser","title1","body1");
        List<Entry> entries = diaryServices.getallEntriesByDiaryId("testUser");
        assertNotNull(entries);
        assertEquals(2, entries.size());
        assertEquals("title1",entries.get(0).getTitle());
    }
//    @Test
//    public void testThatDiaryCanDeletedEntrySuccessfullyByTitle() {
//        diaryServices.register("testUser","pass1234");
//        diaryServices.login("testUser","pass1234");
//        diaryServices.addEntryInDiary("testUser","title","fat boy who chop your fries");
//
//        String result = diaryServices.deleteEntryFromDiaryByTitle("testUser", "title");
//
//        assertEquals("Entry Successfully Deleted", result);
////        List<Entry> entries = diaryServices.getallEntriesByDiaryId(diaryId);
////        assertEquals(0, entries.size());
//
//    }

}
