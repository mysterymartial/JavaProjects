package africa.semicolon.data.repository;

import africa.semicolon.data.model.Packages;
import africa.semicolon.data.model.Receiver;
import africa.semicolon.data.model.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;


import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class PackageRepositoryTest {

    @Autowired
    private PackageRepository packageRepository;
    private ReceiverRepository receiverRepository;

    @Test
    public void testPackageRepository() {
        Receiver receiver = new Receiver();
        receiver.setId("receiver1");
        receiver.setFullName("John Doe");
        receiver.setPhoneNumber("123456789");
        receiver.setAddress("123 Street");
        receiverRepository.save(receiver);
        Receiver fecthedReceiver = receiverRepository.findById(receiver.getId()).orElse(null);
        assertEquals("receiver1", fecthedReceiver.getId());


//        Sender sender = new Sender();
//        sender.setId("sender1");
//        sender.setName("Jane Doe");
//        sender.setPhoneNumber("987654321");
//
//        // Create Package
//        Packages newPackage = new Packages();
//        newPackage.setId("package1");
//        newPackage.setReceiverId(receiver);
//        newPackage.setSenderId(sender);
//      newPackage.setDeliveryFee(BigDecimal.valueOf(50.75));
//        newPackage.setQuantity(2);
//        newPackage.setDescription("Electronics");
//
//       // Save Package
//        packageRepository.save(newPackage);
//
//        // Retrieve Package
//        Packages retrievedPackage = packageRepository.findById("package1").orElse(null);
//
//        // Assertions
//       assertThat(retrievedPackage).isNotNull();
//       assertThat(retrievedPackage.getReceiverId().getFullName()).isEqualTo("John Doe");
//       assertThat(retrievedPackage.getSenderId().getName()).isEqualTo("Jane Doe");        assertThat(retrievedPackage.getDeliveryFee()).isEqualTo(BigDecimal.valueOf(50.75));
    }
}




