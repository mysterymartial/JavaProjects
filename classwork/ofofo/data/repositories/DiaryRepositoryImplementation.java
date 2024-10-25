package repositories;

import models.Diary;


import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImplementation implements DiaryRepository {
    private final List<Diary> diaries = new ArrayList<>();
    @Override
    public void save(Diary diary) {
        diaries.add(diary);


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


}
