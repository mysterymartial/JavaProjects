package repositories;
import models.Diary;
import models.Entry;

import java.util.List;

public interface DiaryRepository {
    void save(Diary diary);
    Diary findUserName(String userName);
    void deleteByUserName(String userName);
    void updateEntry(String diaryId, int entryId, String newTitle, String newBody);
    long diaryCount();
    Entry getByDiaryIdAndEntryId(int id,String DiaryId);
    List<Entry> FindAllEntriesInADiary(String diaryId);
    List<Diary>findAll();
    void deleteDiaryWithId(String diaryId);
    void deleteAllEntries(String diaryId);
}
