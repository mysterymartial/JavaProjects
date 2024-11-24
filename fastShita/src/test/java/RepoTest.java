
import data.repository.PackageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataMongoTest
@SpringBootTest
public class RepoTest {
    @Autowired
    private PackageRepository packageRepository;
    @Test
    public void testPacakageRepository() {

    }

}
