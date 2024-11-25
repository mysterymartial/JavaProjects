package africa.semicolon.services;

import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.response.PacakageResponseDto;
import africa.semicolon.dto.response.SenderResponse;

public interface SenderService {

    SenderResponse createSender(SenderRequest senderRequest);

}
