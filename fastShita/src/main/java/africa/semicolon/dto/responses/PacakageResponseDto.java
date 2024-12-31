package africa.semicolon.dto.responses;

import africa.semicolon.data.model.Receiver;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PacakageResponseDto {

    private String senderFullName;        // Full name of the sender
    private String receiverFullName;      // Full name of the receiver
    private BigDecimal deliveryFee;       // The delivery fee for the package
    private int quantity;
    private String id;
    private String description;           // Description of the package contents
    private String createdAt;     // Creation timestamp of the package
    private String senderId;
    private String receiverId;
    private String receiverAddress;
    private String receiverPhoneNumber;
    private String senderPhoneNumber;

}
