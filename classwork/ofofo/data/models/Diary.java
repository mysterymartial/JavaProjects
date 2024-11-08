package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<Entry>();
    private String title;
    private String description;
    private String diaryId;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    public Diary(){

    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public List<Entry> getEntries() {
        return entries;
    }
    public void setEntries(List<Entry> entries) {
        this.entries = new ArrayList<>(entries);
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    public boolean getLocked() {
        return isLocked;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void unLock(String inputPassword) {
        if (inputPassword.equals(password)) {
            isLocked = false;
        } else {
            throw new InputMismatchException("enter right password");
        }
    }


    public String getdiaryId() {
        return diaryId;
    }
    public void setdiaryId(String diaryId) {
        this.diaryId = diaryId;
    }

}
