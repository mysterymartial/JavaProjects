package data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private String diaryId;
}
