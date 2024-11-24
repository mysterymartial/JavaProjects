package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Sender {
    private String phoneNumber;

    @Id
    private String id;
    private String name;
}
