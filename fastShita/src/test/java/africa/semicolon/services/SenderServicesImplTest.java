package africa.semicolon.services;

import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.SenderRepository;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.response.SenderResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.bson.assertions.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
        Sender sender = new Sender();
        sender.setId("1");
        Mockito.when(senderRepository.save(sender)).thenReturn(sender);
        SenderResponse response = senderServices.createSender(senderRequest);
        assertNotNull(response);
        assertEquals("mystery love",response.getFullName());
        assertEquals("1",response.getId());
    }


}