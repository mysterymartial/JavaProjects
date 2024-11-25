package africa.semicolon.util;

import africa.semicolon.data.model.Sender;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.response.SenderResponse;

public class SenderMapper {
    public static Sender toSender(SenderRequest dto) {
        Sender sender = new Sender();
        sender.setFullName(dto.getFullName());
        sender.setPhoneNumber(dto.getPhoneNumber());

        return sender;

    }
    public static SenderResponse toSenderResponse(Sender sender) {
        SenderResponse response = new SenderResponse();
        response.setId(sender.getId());
        response.setFullName(sender.getFullName());
        response.setPhoneNumber(sender.getPhoneNumber());

        return response;


    }
}
