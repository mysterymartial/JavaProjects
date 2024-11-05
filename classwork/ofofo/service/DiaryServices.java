package service;

import models.Diary;
import models.Entry;

public interface DiaryServices {
    void register(String userName, String password);
    boolean login(String userName, String password);
    void logout();

    void addEntryToDiary(String diaryId, Entry entry);
    void updateEntryToDiary(String diaryId, String title, String description,int id);

    Diary getUserName(String userName);
    void updateEntry(int diaryId, int entryId, String title, String body);
}
