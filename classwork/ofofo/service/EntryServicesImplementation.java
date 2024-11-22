package service;

import models.Entry;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;

import java.util.List;
import java.util.NoSuchElementException;

public class EntryServicesImplementation implements EntryServices {
    private EntryRepository entryRepo;

    public EntryServicesImplementation() {
        this.entryRepo = new EntryRepositoryImplementation();
    }

    @Override
    public String createEntry(String title, String body, int entryId) {
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
        Entry entry = entryRepo.findById(entryId);
        if (entry == null) {
            throw new NoSuchElementException("entry do not exist");
        }
        entryRepo.deleteById(entryId);
        return "Entry Successfully Deleted";
    }

    @Override
    public List<Entry> getAllEntries() {
        return entryRepo.findAll();
    }


    @Override
    public Entry getEntryById(int id) {
        return entryRepo.findById(id);
    }

    @Override
    public Entry getEntryByTitle(String title) {
        return entryRepo.findByTitle(title);
    }

    @Override
    public String deleteEntryByTitle(String title) {
        Entry entry = entryRepo.findByTitle(title);
        if (entry == null) {
            throw new NoSuchElementException("entry do not exist");
        }
        entryRepo.deleteByTitle(title);
        return "Entry Successfully Deleted";
    }
}
