package diary;

import java.util.ArrayList;

import java.lang.reflect.Type;

public class Diary {
    private String name;
    private String password;
    private boolean isLocked = false;
    private int nextId = 1;
    private ArrayList<Entry> entries = new ArrayList<>(9);
    public Diary(String name,String password){
        this.name= name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return entries.size() == 0;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void lock(){
        isLocked = true;
    }

    public void unLock(String corretPin) {
        if(corretPin.equals(password))isLocked = false;
    }

    public void add(String title, String body) {
        NewAdd(title, body);


    }
    private void NewAdd(String title, String body) {
        if(isLocked == false){
            Entry entry = new Entry(title,body,1);
            entries.add(entry);



        }
    }

    public int entriesSize() {
        return entries.size();
    }

    public String findEntryTitleById(int id) {
        if(isLocked == false){
            for(Entry entry: entries){
                if(entry.getId() == id){
                    return entry.getTitle();
                }
            }
            return null;
        }
        return "Diary is locked";

        }

    private Entry findEntryById(int id) {
        for(Entry entry: entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }

    public boolean upadteEntry(int id, String newTitle, String newBody) {
        if(isLocked == false){
            Entry entry = findEntryById(id);
            if(entry != null){
                entries.remove(entry);
                entries.add(new Entry(newTitle,newBody,id));
                return true;
            }
            return false;

        }

        return false;
    }

    public boolean deleteEntry(int i) {
        if(isLocked == false){
            Entry entry = findEntryById(i);
            if(entry != null){
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }

    public String getPassword() {
        return password;
    }
}
