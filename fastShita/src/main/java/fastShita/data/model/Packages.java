package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Packages {
    @Id
    private String id;
    @DBRef
    private Receiver receiverId;
    @DBRef
    private Sender senderId;
    private LocalDateTime createdAt = LocalDateTime.now();
    private BigDecimal deliveryFee;
    private int quantity;
    private String description;
    @DBRef
    private List<TrackingLog> trackingLogs = new ArrayList<>();
}
