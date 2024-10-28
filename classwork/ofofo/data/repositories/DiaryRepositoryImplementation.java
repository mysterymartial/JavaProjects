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
    public void deleteByTitle(String title) {
        diaries.removeIf(diary -> diary.getTitle().equals(title));

    }

    @Override
    public void updateEntry(int id, String newTitle, String newBody) {
        diaries.stream()
                .filter(diary -> diary.getId() == id)
                .findFirst()
                .ifPresent(diary -> {
                    diary.setTitle(newTitle);
                    diary.setDescription(newBody);
                });


    }

    @Override
    public long diaryCount() {
        return diaries.stream().count();
    }


}
