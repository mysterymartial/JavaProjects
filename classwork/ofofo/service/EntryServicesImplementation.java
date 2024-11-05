package service;

import models.Diary;
import models.Entry;

import java.util.List;

public class EntryServicesImplementation implements EntryServices {
    @Override
    public void addEntry(Entry entry) {

    }

    @Override
    public void updateEntry(Entry entry) {

    }

    @Override
    public void deleteEntry(Entry entry) {

    }

    @Override
    public List<Entry> getAllEntries() {
        return List.of();
    }

    @Override
    public Entry getEntryById(int id) {
        return null;
    }

    @Override
    public Entry getEntryByTitle(String title) {
        return null;
    }

    @Override
    public List<Diary> getDiaryByEntryId(int entryId) {
        return List.of();
    }
}
