package repositories;

import models.Diary;
import models.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DiaryRepositoryImplementation implements DiaryRepository {
    private final List<Diary> diaries = new ArrayList<>();
    @Override
    public void save(Diary diary) {
        Diary existinDiary = findUserName(diary.getUserName());
        if (existinDiary != null) {
            updateDiary(diary, existinDiary);
        }else {
            diaries.add(diary);
        }


    }

    @Override
    public Diary findUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public void deleteByUserName(String userName) {
        Diary existinDiary = findUserName(userName);
        if (existinDiary != null) {
            diaries.remove(existinDiary);

        }
        return;

    }

    @Override
    public void updateEntry(String diaryId, int entryId, String newTitle, String newBody) {
        diaries.stream()
                .filter(diary -> diary.getdiaryId().equals(diaryId))
                .flatMap(diary -> diary.getEntries().stream())
                .filter(entry -> entry.getId() == entryId)
                .findFirst()
                .ifPresent(entry -> {
                    entry.setTitle(newTitle);
                    entry.setBody(newBody);
                });






    }

    @Override
    public long diaryCount() {
        return diaries.stream().count();
    }

    @Override
    public Entry getByDiaryIdAndEntryId(int id, String diaryId) {
        return diaries.stream()
                .filter(diary -> diary.getdiaryId().equals(diaryId))
                .flatMap(diary -> diary.getEntries().stream())
                .filter(entry -> entry.getId() == id )
                .findFirst()
                .orElse(null);


    }

    @Override
    public List<Entry> FindAllEntriesInADiary(String diaryId) {
        Optional<Diary> diary = diaries.stream()
                .filter(mydiary -> mydiary.getdiaryId().equals(diaryId) )
                .findFirst();
        return diary.map(Diary::getEntries).orElse(new ArrayList<>());


    }

    @Override
    public List<Diary> findAll() {
        return new ArrayList<>(diaries) ;
    }

    @Override
    public void deleteDiaryWithId(String diaryId) {
        Optional<Diary> diary = findByDiaryId(diaryId);
        diary.ifPresent(diary1 -> diaries.remove(diary1));



    }

    @Override
    public void deleteAllEntries(String diaryId) {
        findByDiaryId(diaryId).ifPresent(diary -> diary.getEntries().clear());
    }

    private void updateDiary(Diary existingDiary, Diary newDiary) {
        existingDiary.setPassword(newDiary.getPassword());
        existingDiary.setUserName(newDiary.getUserName());
        existingDiary.setLocked(newDiary.isLocked());

    }
    public Optional<Diary> findByDiaryId(String diaryId) {
        return diaries.stream()
                .filter(diary -> diary.getdiaryId().equals(diaryId))
                .findFirst();
    }
    private void deleteAllDiaries() {
        diaries.clear();
    }
}
