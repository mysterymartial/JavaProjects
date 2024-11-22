package services;

import dto.RegisterDetails;

import java.util.List;

public interface DiaryServices {
    String register(RegisterDetails details);
    String login(RegisterDetails details);
    String logout();

//    String addEntryInDiary(String userName, String title,String body);//editing here
//    String updateEntryInDiary(String diaryId, String title, String description);

//    RegisterDetails getDiaryByUserName(String userName);
//    List<R> getallEntriesByDiaryId(String diaryId);
//    String deleteEntryFromDiaryByTitle(String diaryId, String entryTitle);
//    String deleteEntryFromDiaryByEntryId(String diaryId, int entryId);
}
