package africa.semicolon.services;

import africa.semicolon.data.model.Packages;
import africa.semicolon.data.repository.PackageRepository;
import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.responses.PacakageResponseDto;
import africa.semicolon.util.PacakageMapper;

public class PackageServiceImpl implements PackageService {
    private PackageRepository packageRepository;
    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }
    @Override
    public PacakageResponseDto createPackage(PackageRequestDto packageRequestDto) {
        Packages pack = PacakageMapper.toPackages(packageRequestDto);
        packageRepository.save(pack);
        return PacakageMapper.toPacakageResponse(pack);

    }
}
