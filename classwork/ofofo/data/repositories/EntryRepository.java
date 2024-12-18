package repositories;

import dataStructure.ArrayList;
import models.Entry;

import java.util.List;

public interface EntryRepository {
    void save(Entry entry);
    Entry findById(int id);
    Entry findByTitle(String title);
    void updateById(int id, String newtitle, String newbody);
    void deleteById(int id);
    void deleteByTitle(String title);
    List <Entry> findAll();
    void deleteAllEntries();

}
