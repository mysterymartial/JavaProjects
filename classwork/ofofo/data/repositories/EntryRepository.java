package repositories;

import models.Entry;

public interface EntryRepository {
    void save(Entry entry);
    Entry findById(int id);
    void updateById(int id, String newtitle, String newbody);
    void deleteById(int id);
    void deleteByTitle(String title);

}
