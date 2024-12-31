package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class ReceiverRequest {
    private String fullName;
    private String phoneNumber;
    private String address;
    private String id;
}
