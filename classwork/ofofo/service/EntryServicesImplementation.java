package service;

import models.Diary;
import models.Entry;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;

import java.util.ArrayList;
import java.util.List;

public class EntryServicesImplementation implements EntryServices {
    private EntryRepository entryRepo;
    public EntryServicesImplementation() {
        this.entryRepo = new EntryRepositoryImplementation();
    }

    @Override
    public String createEntry(String title, String body,int entryId) {
        entryRepo.save(new Entry(entryId, title, body));
        return "Entry created";
    }

    @Override
    public String updateEntry(int id, String newTitle, String newBody) {
        entryRepo.updateById(id, newTitle, newBody);
        return "Entry Successfully Updated";
    }

    @Override
    public String deleteEntryById(int entryId) {
        return "";
    }

    @Override
    public String getAllEntries() {
        List<Entry> entries = entryRepo.findAll();
        return entries.toString();
    }



    @Override
    public String getEntryById(int id) {
        return "";
    }

    @Override
    public String getEntryByTitle(String title) {
        return "";
    }

    @Override
    public String deleteEntryByTitle(String title) {
        return "";
    }
}
