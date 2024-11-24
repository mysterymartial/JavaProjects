package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Receiver {
    private String fullName;
    private String phoneNumber;
    private String address;
    @Id
    private String id;
}
