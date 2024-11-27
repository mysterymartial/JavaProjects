package africa.semicolon.services;

import africa.semicolon.dto.request.ReceiverRequest;
import africa.semicolon.dto.responses.ReceiverResponse;

public interface ReceiverService {
    ReceiverResponse createReceiver(ReceiverRequest receiverRequest);

}
