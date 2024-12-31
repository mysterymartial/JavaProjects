package africa.semicolon.services;

import africa.semicolon.data.model.Receiver;
import africa.semicolon.data.repository.ReceiverRepository;
import africa.semicolon.dto.request.ReceiverRequest;
import africa.semicolon.dto.responses.ReceiverResponse;
import africa.semicolon.util.ReceiverMapper;

public class ReceiverServiceImpl implements ReceiverService {
    private ReceiverRepository receiverRepository;
    public ReceiverServiceImpl(ReceiverRepository receiverRepository) {
        this.receiverRepository = receiverRepository;
    }

    @Override
    public ReceiverResponse createReceiver(ReceiverRequest receiverRequest) {
        Receiver receiver = ReceiverMapper.toreceiver(receiverRequest);
        receiverRepository.save(receiver);
        return ReceiverMapper.toReceiverResponse(receiver);



    }
}
