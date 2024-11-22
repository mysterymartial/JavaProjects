package service;

import models.Diary;
import models.Entry;

import java.util.List;

public interface DiaryServices {
    String register(String userName, String password);
    String login(String userName, String password);
    String logout();

    String addEntryInDiary(String userName, String title,String body);//editing here
    String updateEntryInDiary(String diaryId, String title, String description);

    Diary getDiaryByUserName(String userName);
    List<Entry> getallEntriesByDiaryId(String diaryId);
    String deleteEntryFromDiaryByTitle(String diaryId, String entryTitle);
    String deleteEntryFromDiaryByEntryId(String diaryId, int entryId);
}
