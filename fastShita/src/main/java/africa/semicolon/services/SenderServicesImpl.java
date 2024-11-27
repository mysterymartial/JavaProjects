package africa.semicolon.services;

import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.SenderRepository;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.responses.SenderResponse;
import africa.semicolon.util.SenderMapper;
import org.springframework.stereotype.Service;

@Service
public class SenderServicesImpl implements SenderService {
    private SenderRepository senderRepository;
    public SenderServicesImpl(SenderRepository senderRepository) {
        this.senderRepository = senderRepository;
    }



    @Override
    public SenderResponse createSender(SenderRequest senderRequest) {
        Sender sender = SenderMapper.toSender(senderRequest);
        senderRepository.save(sender);
        return SenderMapper.toSenderResponse(sender);
    }




}
