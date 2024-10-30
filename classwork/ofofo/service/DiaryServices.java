package service;

import models.Diary;
import models.Entry;

public interface DiaryServices {
    void register(String userName, String password);
    boolean login(String userName, String password);
    void logout();
    void addEntry(int diaryId, Entry entry);
    Diary getUserName(String userName);
    void updateEntry(int diaryId, int entryId, String title, String body);
}
