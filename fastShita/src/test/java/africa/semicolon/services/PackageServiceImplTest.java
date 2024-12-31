package africa.semicolon.services;

import africa.semicolon.data.model.Packages;
import africa.semicolon.data.model.Receiver;
import africa.semicolon.data.model.Sender;
import africa.semicolon.data.repository.PackageRepository;
import africa.semicolon.dto.request.PackageRequestDto;
import africa.semicolon.dto.responses.PacakageResponseDto;
import africa.semicolon.util.PacakageMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PackageServiceImplTest {
    @Mock
    private PackageRepository packageRepository;
    @InjectMocks
    private PackageServiceImpl packageService;
    private PackageRequestDto packageRequestDto;

    private Packages mockSavedPackage;

    @BeforeEach
    public void setUp() {
        // Prepare a valid PackageRequestDto
        packageRequestDto = new PackageRequestDto();
        packageRequestDto.setSenderId("sender123");
        packageRequestDto.setReceiverId("receiver123");
        packageRequestDto.setDeliveryFee(BigDecimal.valueOf(1000));
        packageRequestDto.setQuantity(5);
        packageRequestDto.setDescription("Fragile items");
        packageRequestDto.setSenderName("Alice Johnson");
        packageRequestDto.setReceiverName("Bob Brown");
        packageRequestDto.setSenderPhoneNumber("08012345678");
        packageRequestDto.setReceiverPhoneNumber("08187654321");
        packageRequestDto.setReceiverAddress("123 Street Name");

        // Prepare a mock saved Packages entity
        mockSavedPackage = new Packages();
        mockSavedPackage.setId("package123");
        mockSavedPackage.setSenderName("Alice Johnson");
        mockSavedPackage.setReceiverName("Bob Brown");
        mockSavedPackage.setDeliveryFee(BigDecimal.valueOf(1000));
        mockSavedPackage.setQuantity(5);
        mockSavedPackage.setDescription("Fragile items");
        mockSavedPackage.setSenderPhoneNumber("08012345678");
        mockSavedPackage.setReceiverPhoneNumber("08187654321");
        mockSavedPackage.setReceiverAddress("123 Street Name");
    }

    @Test
    void testCreatePackage() {
        // Mock repository save behavior
        Mockito.when(packageRepository.save(Mockito.any(Packages.class))).thenReturn(mockSavedPackage);

        // Call the service method
        PacakageResponseDto response = packageService.createPackage(packageRequestDto);

        // Assert the response
        assertNotNull(response);
        assertEquals("package123", response.getId());
        assertEquals("Alice Johnson", response.getSenderFullName());
        assertEquals("Bob Brown", response.getReceiverFullName());
        assertEquals(BigDecimal.valueOf(1000), response.getDeliveryFee());
        assertEquals(5, response.getQuantity());
        assertEquals("Fragile items", response.getDescription());
        assertEquals("08012345678", response.getSenderPhoneNumber());
        assertEquals("08187654321", response.getReceiverPhoneNumber());
        assertEquals("123 Street Name", response.getReceiverAddress());

        // Verify repository interaction
        Mockito.verify(packageRepository, times(1)).save(Mockito.any(Packages.class));
    }



}