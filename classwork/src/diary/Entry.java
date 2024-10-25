package diary;

public class Entry {
    private String title;
    private String body;
    private int id;
    public Entry(String title, String body, int id) {
        this.title = title;
        this.body = body;
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Entry{" + "title=" + title + ", body=" + body + ", id=" + id + '}';
    }
}
