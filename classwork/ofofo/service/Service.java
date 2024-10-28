package service;

import models.Diary;
import models.Entry;

import java.util.List;

public interface Service {
    void registerUser(String username, String password);
    boolean loginUser(String username, String password);
    void logoutUser();
    void lock();
    void unlock(String password);
    void createDiary(String userName, String password);
    Diary DeleteDiary(String userName);
    Diary findDiaryByUserName(String userName);
    void changePassword(String userName, String oldPassword, String newPassword);
    void addEntriesToDiary(String title, String body);
    List<Entry> findAllEntriesFromDiary();
    Entry findEntryByTitle(String title);
    void updateEntryById(int entryId, String title, String body);
    void deleteEntryById(int entryId);
    void deleteEntryFromDiaryByTitle(String title);
    void dleleteAllEntriesFromDiary();





}
