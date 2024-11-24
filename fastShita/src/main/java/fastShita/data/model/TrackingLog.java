package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class TrackingLog {

    private String description;
    private LocalDateTime trackingDate= LocalDateTime.now();
    private String trackingNumber;
    @Id
    private String id;

}
