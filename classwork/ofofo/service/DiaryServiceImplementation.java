package service;

import models.Diary;
import models.Entry;
import repositories.DiaryRepositoryImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DiaryServiceImplementation implements DiaryServices{
    private DiaryRepositoryImplementation diaryRepository = new DiaryRepositoryImplementation();
    private String currentDiaryId;
    private Map<String,String> userDiaryId = new HashMap<>();
    @Override
    public void register(String userName, String password) {
        if(diaryRepository.findUserName(userName) != null) {
            throw new IllegalArgumentException("User already exists");
        }
        Diary diary = new Diary(userName, password);
        diary.setdiaryId(generateDiaryId());
        diaryRepository.save(diary);
        currentDiaryId = diary.getdiaryId();
        userDiaryId.put(userName, currentDiaryId);
    }

    @Override
    public boolean login(String userName, String password) {
        Diary diary = diaryRepository.findUserName(userName);
        if(diary == null) {
            return false;
        }
        if(diary.getPassword().equals(password)) {
            currentDiaryId = diary.getdiaryId();
            return true;
        }
        return false;

    }

    @Override
    public void logout() {
        currentDiaryId = null;

    }

    @Override
    public void addEntryToDiary(String diaryId, Entry entry) {
        Diary diary = diaryRepository.findByDiaryId(diaryId).orElse(null);
        if(diary == null) {
            throw new IllegalArgumentException("diary does not exist");
        }
        if (diary.isLocked()){
            throw new IllegalArgumentException("diary is locked");
        }

        diary.getEntries().add(entry);
        diaryRepository.save(diary);

    }

    @Override
    public void updateEntryToDiary(String diaryId, String title, String description, int id) {
        Diary diary = diaryRepository.findByDiaryId(diaryId).orElse(null);
        if(diary == null) {
            throw new IllegalArgumentException("diary does not exist");
        }
        Optional<Entry> entriesToUpdate = diary.getEntries().stream()
                .filter(entry -> entry.getId() == id)
                .findFirst();
        if(entriesToUpdate.isPresent()) {
            entriesToUpdate.get().setTitle(title);
            entriesToUpdate.get().setBody(description);
            diaryRepository.save(diary);
        }else{
            throw new IllegalArgumentException("Entry does not exist");
        }

    }


    @Override
    public Diary getUserName(String userName) {
        return diaryRepository.findUserName(userName);
    }

    @Override
    public void updateEntry(int diaryId, int entryId, String title, String body) {

    }
    private String generateDiaryId() {
        return "diary-"  + (diaryRepository.diaryCount() +1);
    }
    public String getDiaryIdByUserName (String userName) {
        String diaryId = userDiaryId.get(userName);
        if(diaryId == null){
            throw new IllegalStateException("no diary id avaliable");
        }
        return diaryId;
    }
    public String getCurrentDiaryId() {
        if(currentDiaryId == null) {
            throw new IllegalStateException("no current diary id avaliable");
        }
        return currentDiaryId;
    }
    public void unLcockDiary(String userName, String password) {
        Diary diary = diaryRepository.findUserName(userName);
        if(diary != null) {
            diary.unLock(password);
            diaryRepository.save(diary);

        }
    }
}



