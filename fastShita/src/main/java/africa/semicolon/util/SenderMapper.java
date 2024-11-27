package africa.semicolon.util;

import africa.semicolon.data.model.Sender;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.responses.SenderResponse;

import java.util.function.Function;

public class SenderMapper {
    public static Sender toSender(SenderRequest dto) {
        return mapAttributes(dto,request->{
            Sender sender = new Sender();
            sender.setFullName(dto.getFullName());
            sender.setPhoneNumber(dto.getPhoneNumber());
            //sender.setId(dto.getId());
            return sender;

        });




    }
    public static SenderResponse toSenderResponse(Sender sender) {
        return mapAttributes(sender, send->{
            SenderResponse response = new SenderResponse();
            response.setId(sender.getId());
            response.setFullName(sender.getFullName());
            response.setPhoneNumber(sender.getPhoneNumber());

            return response;

        });



    }
    public static <T,R> R mapAttributes(T source, Function<  T, R> mapper) {
        return mapper.apply(source);

    }
}
