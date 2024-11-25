package africa.semicolon.services;

import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.SenderRepository;
import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.response.PacakageResponseDto;
import africa.semicolon.dto.response.SenderResponse;
import africa.semicolon.expection.SenderNotFound;
import africa.semicolon.util.SenderMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SenderServicesImpl implements SenderService {
    private SenderRepository senderRepository;
    private SenderMapper senderMapper;



    @Override
    public SenderResponse createSender(SenderRequest senderRequest) {
        Sender sender = senderMapper.toSender(senderRequest);
        senderRepository.save(sender);
        return senderMapper.toSenderResponse(sender);
    }




}
