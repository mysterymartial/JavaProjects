package africa.semicolon.dto.responses;

import lombok.Data;

@Data
public class ReceiverResponse {
    private String id;
    private String fullName;
    private String phoneNumber;
    private String address;
}
