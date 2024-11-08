package service;

import models.Diary;
import models.Entry;
import repositories.DiaryRepository;
import repositories.DiaryRepositoryImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DiaryServiceImplementation implements DiaryServices {
    private final DiaryRepository diaryRepository;
    private Diary currentUser = null;
    private int entryIdCounter = 0;
    public DiaryServiceImplementation() {
        this.diaryRepository = new DiaryRepositoryImplementation();
    }

    @Override
    public String register(String userName, String password) {
        if(diaryRepository.findUserName(userName) != null) {
            throw new IllegalArgumentException("Username already exists");
        }

        diaryRepository.save(new Diary(userName, password));

        return "Diary registered successfully";
    }

    @Override
    public String login(String userName, String password) {
        Diary diary = diaryRepository.findUserName(userName);
        if(diary != null && diary.getPassword().equals(password)) {
            currentUser = diary;
            diary.setLocked(false);
            return "Login successfully";
        }
        throw new IllegalArgumentException("Invalid username or password");
    }

    @Override
    public String logout() {
        if(currentUser == null) {
            return "No user is currently logged in";
        }
        currentUser.setLocked(true);
        currentUser = null;
        return "Logout successfully";
    }

    @Override
    public String addEntryInDiary(String userName,  String title, String body) {
        Diary diary = diaryRepository.findUserName(userName);
        if(diary != null && !diary.isLocked()) {
            EntryServices entry = new EntryServicesImplementation();
            entry.createEntry(title,body,generateEntryIdCounter()+1);
            return "Entry Successfully Created";
        }
        throw new IllegalArgumentException("Entries cannot be added to invalid diary");

    }

    @Override
    public String updateEntryInDiary(String userName, String newTitle, String description) {
        Diary diary = diaryRepository.findUserName(userName);
        if (diary != null && !diary.isLocked()) {
            EntryServices entry = new EntryServicesImplementation();
            entry.updateEntry(entryIdCounter, newTitle, description);
            return "Entry Successfully Updated";
        }
            throw new IllegalArgumentException("Entries cannot be updated , invalid diary");

    }


    @Override
    public Diary getDiaryByUserName(String userName) {
        Diary diary = diaryRepository.findUserName(userName);
        if (diary != null) {
            return diary;
        } else {
            throw new IllegalArgumentException("Diary not found");
        }
    }



    @Override
    public String getallEntriesByDiaryId(String diaryId) {
        return "";
    }

    @Override
    public String deleteEntryFromDiaryByTitle(String diaryId, String entryTitle) {
        return "";
    }

    @Override
    public String deleteEntryFromDiaryByEntryId(String diaryId, int entryId) {
        return "";
    }
    public int generateEntryIdCounter() {
        return entryIdCounter++;
    }

}

