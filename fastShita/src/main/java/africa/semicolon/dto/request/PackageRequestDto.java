package africa.semicolon.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PackageRequestDto {
    private String senderId;       // The ID of the sender
    private String receiverId;     // The ID of the receiver
    private BigDecimal deliveryFee; // The delivery fee for the package
    private int quantity;          // Number of items in the package
    private String description;
    private String senderName;
    private String receiverName;
    private String senderPhoneNumber;
    private String receiverPhoneNumber;
    private String receiverAddress;


}
