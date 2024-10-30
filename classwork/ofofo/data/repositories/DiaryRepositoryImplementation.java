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
        Diary existingDiary = findUserName(diary.getUserName());
        if (existingDiary != null) {
            updateDiary(diary, existingDiary);

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
    private void updateDiary(Diary existingDiary, Diary newDiary) {
        existingDiary.setPassword(newDiary.getPassword());
        existingDiary.setEntries(newDiary.getEntries());
        existingDiary.setLocked(newDiary.isLocked());

    }

    @Override
    public void deleteByUserName(String userName) {
        Diary diary = findUserName(userName);
        if (diary != null) {
            diaries.remove(diary);

        }else {
            throw new IllegalArgumentException("User not found");
        }


    }





    @Override
    public void updateEntry(int diaryid,int entryId, String newTitle, String newBody) {
        diaries.stream()
                .filter(diary -> diary.getdiaryId() == entryId)
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
    public Entry getByDiaryIdAndEntryId(int id, int diaryId) {
        return diaries.stream()
                .filter(diary -> diary.getdiaryId() == diaryId)
                .flatMap(diary ->diary.getEntries().stream())
                .filter(entry -> entry.getId() == id)
                .findFirst()
                .orElse(null);

    }

    @Override
    public List<Entry> FindAllEntriesInADiary(int diaryId) {
        Optional<Diary> diary = diaries.stream()
                .filter(myDiary -> myDiary.getdiaryId() == diaryId)
                .findFirst();
        return diary.map(Diary::getEntries).orElse(new ArrayList<>());
    }

    @Override
    public List<Diary> findAll() {
        return new ArrayList<>(diaries);
    }


}
