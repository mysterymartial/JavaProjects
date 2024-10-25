package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = false;
    private List<Entry> entries = new ArrayList<Entry>();
    private String title;
    private String description;
    private int id;

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


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
