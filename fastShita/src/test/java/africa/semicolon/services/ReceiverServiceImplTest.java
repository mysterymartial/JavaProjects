package africa.semicolon.services;

import africa.semicolon.data.model.Receiver;
import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.ReceiverRepository;
import africa.semicolon.dto.request.ReceiverRequest;
import africa.semicolon.dto.responses.ReceiverResponse;
import africa.semicolon.util.ReceiverMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class ReceiverServiceImplTest {
    @Mock
    private ReceiverRepository receiverRepository;
    @InjectMocks
    private ReceiverServiceImpl receiverService;
    @Test
    public void testThatReceiverCanBeCreated() {
        ReceiverRequest receiverRequest = new ReceiverRequest();
        receiverRequest.setAddress("1,bode thomas");
        receiverRequest.setPhoneNumber("08159089791");
        receiverRequest.setFullName("mystery love");
        Receiver receiver = ReceiverMapper.toreceiver(receiverRequest);
        receiver.setId(receiverRequest.getId());
        Mockito.when(receiverRepository.save(Mockito.any(Receiver.class))).thenReturn(receiver);
        ReceiverResponse response = receiverService.createReceiver(receiverRequest);
        assertNotNull(response);
        assertEquals(receiverRequest.getId(), response.getId());
        assertEquals("mystery love", response.getFullName());
        assertEquals("08159089791", response.getPhoneNumber());

    }

}