package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class TrackingLogRequestDto {
    private String packageId;
    private String description;
    private String trackingNumber;
}
