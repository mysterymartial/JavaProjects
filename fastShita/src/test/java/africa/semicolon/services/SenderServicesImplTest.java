package africa.semicolon.services;

import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.SenderRepository;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.responses.SenderResponse;
import africa.semicolon.util.SenderMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.bson.assertions.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
class SenderServicesImplTest {
    @Mock
    private SenderRepository senderRepository;
    @InjectMocks
    private SenderServicesImpl senderServices;
    @Test
    public void testThatCreatedSenderShouldReturnSavedSender() {
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setFullName("mystery love");
        senderRequest.setPhoneNumber("09010849782");
        Sender sender = SenderMapper.toSender(senderRequest);
        sender.setId(senderRequest.getId());
        Mockito.when(senderRepository.save(Mockito.any(Sender.class))).thenReturn(sender);
        SenderResponse response = senderServices.createSender(senderRequest);
        Assertions.assertNotNull(response);
        assertEquals("mystery love", response.getFullName());
        assertEquals("09010849782", response.getPhoneNumber());
        assertEquals(sender.getId(), response.getId());
    }


}