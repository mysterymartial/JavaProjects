import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeaserTest{

	@Test
	public void cesearCipher(){
	Ceaser ceaser = new Ceaser();
	String encryted = ceaser.encrypt("boy");
	assertEquals("erb",encryted);

}

}