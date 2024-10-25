package repositories;

import models.Diary;

public interface DiaryRepository {
    void save(Diary diary);
    Diary findUserName(String userName);
    void deleteByUserName(String userName);
    void deleteByTitle(String title);
    void updateEntry(int id, String newTitle, String newBody);
}
