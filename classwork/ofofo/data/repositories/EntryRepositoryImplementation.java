package repositories;

import models.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EntryRepositoryImplementation implements EntryRepository {
    private List<Entry> entries = new ArrayList<>();
    private int idCounter = 0;

    @Override
    public void save(Entry newEntry) {
        Entry existingEntry = findById(newEntry.getId());
        if (existingEntry != null) {
            updateById(newEntry.getId(), newEntry.getTitle(), newEntry.getBody());
        }else{
            newEntry.setId(idCounter++);
            entries.add(newEntry);
        }

    }

    @Override
    public Entry findById(int id) {
        return entries.stream()
                .filter(entry -> entry.getId() ==id)
                .findFirst()
                .orElse(null);


    }

    @Override
    public Entry findByTitle(String title) {
        return entries.stream()
                .filter(entry -> entry.getTitle() == title)
                .findFirst()
                .orElse(null);

    }

    @Override
    public void updateById(int id, String newtitle, String newbody) {
        Entry entry = findById(id);
        if (entry != null) {
            entry.setTitle(newtitle);
            entry.setBody(newbody);
        }

    }

    @Override
    public void deleteById(int id) {
        entries.removeIf(entry -> entry.getId() == id);

    }

    @Override
    public void deleteByTitle(String title) {
        entries.removeIf(entry -> entry.getTitle().equals(title));

    }

    @Override
    public List<Entry> findAll() {
        return entries;
    }




}
