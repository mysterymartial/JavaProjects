package service;

import models.Diary;
import models.Entry;
import repositories.DiaryRepository;
import repositories.DiaryRepositoryImplementation;

public class DiaryServiceImplementation implements DiaryServices{
    private DiaryRepository diaryRepository = new DiaryRepositoryImplementation();
    private String currentUser;
    private int currentDiaryId = -1;
    @Override
    public void register(String userName, String password) {
        if(diaryRepository.findUserName(userName) != null) {
            throw new IllegalArgumentException("user already exist");
        }
        Diary diary = new Diary(userName, password);
        diary.setdiaryId(generateDiaryId());
        diaryRepository.save(diary);
        currentDiaryId = diary.getdiaryId();

    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public void addEntry(int diaryId, Entry entry) {

    }

    @Override
    public Diary getUserName(String userName) {
        return null;
    }

    @Override
    public void updateEntry(int diaryId, int entryId, String title, String body) {

    }
    private int generateDiaryId() {
        return diaryRepository.findAll().size() +1;
    }
    public int getCurrentDiaryId() {
        if(currentDiaryId == -1){
            throw new IllegalStateException("no diary id avaliable");
        }
        return currentDiaryId;
    }
}



