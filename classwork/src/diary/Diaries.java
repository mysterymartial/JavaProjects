package diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<Diary>();

    public void addDiary(String userName, String password) {
        Diary newDiary = new Diary(userName, password);
        diaries.add(newDiary);
    }
    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if(diary.getName().equals(userName)) {
                return diary;

            }
        }
        return null;

    }
    public void deleteDiary(String userName, String password) {
        Diary diary = findByUserName(userName);
        if(diary != null) {
            if(diary.getPassword().equals(password)) {
                diaries.remove(diary);
            }
        }
    }
    public int countDiaries() {
        return diaries.size();
    }
}