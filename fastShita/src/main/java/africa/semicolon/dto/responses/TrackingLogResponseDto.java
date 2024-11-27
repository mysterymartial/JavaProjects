package africa.semicolon.dto.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TrackingLogResponseDto {
    private String id;                 // Unique ID of the tracking log
    private String description;        // Description of the tracking activity
    private LocalDateTime trackingDate; // Timestamp for the tracking update
    private String trackingNumber;
}
