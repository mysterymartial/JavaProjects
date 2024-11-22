import dto.RegisterDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import services.DiaryServices;
import services.DiaryServicesImplementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryServicesImplTest {
    private DiaryServices diaryServices;
    @BeforeEach
    public void setUp() {
        diaryServices = new DiaryServicesImplementation();
    }
    @Test
    public void testRegisterFunctionalityOfDiary() {
        assertEquals("Registration Successful",diaryServices.register(new RegisterDetails()));

    }


}
