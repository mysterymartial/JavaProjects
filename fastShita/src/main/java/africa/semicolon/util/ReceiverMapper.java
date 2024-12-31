package africa.semicolon.util;

import africa.semicolon.data.model.Receiver;
import africa.semicolon.data.model.Sender;
import africa.semicolon.dto.request.ReceiverRequest;
import africa.semicolon.dto.request.SenderRequest;
import africa.semicolon.dto.responses.ReceiverResponse;
import africa.semicolon.dto.responses.SenderResponse;

import java.util.function.Function;

public class ReceiverMapper {

        public static Receiver toreceiver(ReceiverRequest dto) {
            return mapAttributes(dto,request->{
                Receiver receiver = new Receiver();
                receiver.setFullName(dto.getFullName());
                receiver.setPhoneNumber(dto.getPhoneNumber());
                receiver.setAddress(dto.getAddress());
                return receiver;

            });




        }
        public static ReceiverResponse toReceiverResponse(Receiver receiver) {
            return mapAttributes(receiver, send->{
                ReceiverResponse response = new ReceiverResponse();
                response.setId(receiver.getId());
                response.setFullName(receiver.getFullName());
                response.setPhoneNumber(receiver.getPhoneNumber());
                response.setAddress(receiver.getAddress());

                return response;

            });



        }
        public static <T,R> R mapAttributes(T source, Function<  T, R> mapper) {
            return mapper.apply(source);

        }
}
