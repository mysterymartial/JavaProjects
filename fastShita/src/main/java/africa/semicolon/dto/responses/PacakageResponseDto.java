package africa.semicolon.dto.responses;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PacakageResponseDto {
    private String id;                    // Unique ID of the package
    private String senderFullName;        // Full name of the sender
    private String receiverFullName;      // Full name of the receiver
    private BigDecimal deliveryFee;       // The delivery fee for the package
    private int quantity;                 // Number of items in the package
    private String description;           // Description of the package contents
    private LocalDateTime createdAt;      // Creation timestamp of the package
    private List<TrackingLogResponseDto> trackingLogs;
}
