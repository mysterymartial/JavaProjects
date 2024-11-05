package service;

import models.Diary;
import models.Entry;

import java.util.List;

public interface EntryServices {

void addEntry(Entry entry);
void updateEntry(Entry entry);
void deleteEntry(Entry entry);
List<Entry> getAllEntries();
Entry getEntryById(int id);
Entry getEntryByTitle(String title);
List<Diary> getDiaryByEntryId(int entryId);
}
