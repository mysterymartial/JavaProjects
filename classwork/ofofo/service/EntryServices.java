package service;

import models.Diary;
import models.Entry;

import java.util.List;

public interface EntryServices {

String createEntry(String title, String body,int entryId);
String updateEntry(int id, String newTitle, String newBody);
String deleteEntryById(int entryId);
String getAllEntries();
String getEntryById(int id);
String getEntryByTitle(String title);
String deleteEntryByTitle(String title);


}
