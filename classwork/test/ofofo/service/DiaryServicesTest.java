package ofofo.service;

import models.Diary;
import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.DiaryServiceImplementation;
import service.DiaryServices;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServicesTest {
    private DiaryServiceImplementation diaryServices;

    @BeforeEach
    public void setUp() {
        diaryServices = new DiaryServiceImplementation();



    }
    @Test
    public void testRegisterDiaryAccount() {
        diaryServices.register("alice", "correct_password");
        String diaryId = diaryServices.getDiaryIdByUserName("alice");
        assertNotNull(diaryId);
        assertTrue(diaryId.contains("diary-"));

    }
    @Test
    public void testMutipleRegistrationControlMechanism() {
        diaryServices.register("alice","correct_password");
        assertThrows(IllegalArgumentException.class, ()->diaryServices.register("alice","correct_password"));

    }
    @Test
    public void testThatICanRegisterMultipleUsers() {
        diaryServices.register("alice","correct_password");
        String diaryId1 =diaryServices.getDiaryIdByUserName("alice");
        assertNotNull(diaryId1);
        assertTrue(diaryId1.contains("diary-"));
        diaryServices.register("john","correct_password");
        String diaryId2 =diaryServices.getDiaryIdByUserName("john");
        assertNotNull(diaryId2);
        assertTrue(diaryId2.contains("diary-"));
    }

   @Test
    public void testtoAddAnEntryToDiary() {
       diaryServices.register("james", "correct_password");
       diaryServices.unLcockDiary("james", "correct_password");
       String diaryId = diaryServices.getDiaryIdByUserName("james");

       Entry entry = new Entry(1, "First Title", "First Body");
       diaryServices.addEntryToDiary(diaryId, entry);

       Diary retrivedDiary = diaryServices.getUserName("james");
       assertNotNull(retrivedDiary);
       assertEquals(1, retrivedDiary.getEntries().size());
       assertEquals("First Title", retrivedDiary.getEntries().get(0).getTitle());
       assertEquals("First Body", retrivedDiary.getEntries().get(0).getBody());

    }
    @Test
    public void testLoginWithCorrectCredentials() {
        diaryServices.register("alice", "correct_password");
        diaryServices.unLcockDiary("alice", "correct_password");
        assertTrue(diaryServices.login("alice", "correct_password"));

    }
    @Test
    public void testLoginWithInCorrectCredentials(){
        diaryServices.register("alice", "correct_password");
        diaryServices.unLcockDiary("alice", "correct_password");
        assertFalse(diaryServices.login("alice", "wrong_password"));
    }
    @Test
    public void testLogout(){
        diaryServices.register("alice", "correct_password");
        diaryServices.unLcockDiary("alice", "correct_password");
        diaryServices.login("alice", "correct_password");
        diaryServices.logout();
        assertThrows(IllegalStateException.class, ()->diaryServices.getCurrentDiaryId());
    }
    @Test
    public void testToAddEntriesToALockedDiary() {
        diaryServices.register("alice", "correct_password");
        String diaryId = diaryServices.getDiaryIdByUserName("alice");
        Entry entry = new Entry(1, "First Title", "First Body");
        assertThrows(IllegalArgumentException.class, ()->diaryServices.addEntryToDiary(diaryId, entry));
    }
    @Test
    public void testToAddEntriesAfterLoggingOut(){
        diaryServices.register("alice", "correct_password");
        diaryServices.unLcockDiary("alice", "correct_password");
        String diaryId = diaryServices.getDiaryIdByUserName("alice");
        diaryServices.login("alice", "correct_password");
        diaryServices.logout();
        Entry entry = new Entry(1, "First Title", "First Body");
        assertThrows(IllegalStateException.class, ()->diaryServices.addEntryToDiary(diaryId, entry));

    }
    @Test
    public void testToAddEntriesAfterLogin(){
        diaryServices.register("alice", "correct_password");
        diaryServices.unLcockDiary("alice", "correct_password");
        String diaryId = diaryServices.getDiaryIdByUserName("alice");
        diaryServices.login("alice", "correct_password");
        Entry entry = new Entry(1, "First Title", "First Body");
        diaryServices.addEntryToDiary(diaryId, entry);
        diaryServices.updateEntryToDiary(diaryId, "new title","new body",1);
        Diary retrivedDiary = diaryServices.getUserName("alice");
        assertNotNull(retrivedDiary);
        assertEquals(1, retrivedDiary.getEntries().size());
        assertEquals("new title", retrivedDiary.getEntries().get(0).getTitle());
        assertEquals("new body", retrivedDiary.getEntries().get(0).getBody());
    }



}
