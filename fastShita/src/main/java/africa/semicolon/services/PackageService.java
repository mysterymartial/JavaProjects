package africa.semicolon.services;

import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.responses.PacakageResponseDto;

public interface PackageService {
     PacakageResponseDto createPackage(PackageRequestDto packageRequestDto);
}
