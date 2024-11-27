package africa.semicolon.services;

import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.responses.SenderResponse;

public interface SenderService {

    SenderResponse createSender(SenderRequest senderRequest);

}
