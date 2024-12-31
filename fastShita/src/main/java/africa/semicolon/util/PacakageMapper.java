package africa.semicolon.util;

import africa.semicolon.data.model.Packages;
import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.responses.PacakageResponseDto;

import java.util.function.Function;

public class PacakageMapper {
    public static <T,R> R mapAttributes(T source, Function<  T, R> mapper) {
        return mapper.apply(source);

    }
    public static Packages toPackages(PackageRequestDto dto){
        Packages packages = new Packages();
        return mapAttributes(dto, request->{
            packages.setSenderName(dto.getSenderName());
            packages.setReceiverName(dto.getReceiverName());
            packages.setDeliveryFee(dto.getDeliveryFee());
            packages.setQuantity(dto.getQuantity());
            packages.setDescription(dto.getDescription());
            packages.setQuantity(dto.getQuantity());
            packages.setSenderPhoneNumber(dto.getSenderPhoneNumber());
            packages.setReceiverPhoneNumber(dto.getReceiverPhoneNumber());
            packages.setReceiverAddress(dto.getReceiverAddress());

            return packages;

        });



    }
    public static PacakageResponseDto toPacakageResponse(Packages packages){
        return mapAttributes(packages, packageData->{
            PacakageResponseDto response = new PacakageResponseDto();
            response.setSenderFullName(packages.getSenderName());
            response.setReceiverFullName(packages.getReceiverName());
            response.setDeliveryFee(packages.getDeliveryFee());
            response.setQuantity(packages.getQuantity());
            response.setDescription(packages.getDescription());
            response.setQuantity(packages.getQuantity());
            response.setSenderPhoneNumber(packages.getSenderPhoneNumber());
            response.setReceiverPhoneNumber(packages.getReceiverPhoneNumber());
            response.setReceiverAddress(packages.getReceiverAddress());
            response.setSenderId(String.valueOf(packages.getSenderId()));
            response.setReceiverId(String.valueOf(packages.getReceiverId()));
            response.setId(String.valueOf(packages.getId()));
            response.setCreatedAt(String.valueOf(packages.getCreatedAt()));

            return response;


        });


    }
}
