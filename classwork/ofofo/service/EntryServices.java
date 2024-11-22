package service;

import models.Entry;

import java.util.List;

public interface EntryServices {

String createEntry(String title, String body,int entryId);
String updateEntry(int id, String newTitle, String newBody);
String deleteEntryById(int entryId);
List<Entry> getAllEntries();
Entry getEntryById(int id);
Entry getEntryByTitle(String title);
String deleteEntryByTitle(String title);


}
