import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class CreditCardTest{ 

	@Test
	public void checkFirstAlogorithm(){
	CreditCard card = new CreditCard();
	int result = card.firstStep("4388576018402626");
	assertEquals(37, result);

}

	
	@Test
	public void checkSecondAlgorithm(){
	CreditCard card = new CreditCard();
	int result = card.secondStep("4388576018402626");
	assertEquals(38,result);
}


	//@Test
	//public void checkthridAlgorithm(){
	//CreditCard card = new CreditCard();
	//int result = card.thirdstep(37,35);
	//assertEquals(75,result);
//}
	
	@Test
	public void checkForVisaCard(){
	CreditCard card = new CreditCard();
	String result = card.cardCheck("4388576018402626");
	assertEquals("Visa Card",result);
}

	@Test
	public void checkForMasterCard(){
	CreditCard card = new CreditCard();
	String result = card.cardCheck("5388576018402626");
	assertEquals("Master Card",result);
}

	@Test
	public void checkForAmericanExpressCard(){
	CreditCard card = new CreditCard();
	String result = card.cardCheck("3788576018402626");
	assertEquals("American Express Card",result);
}

	@Test
	public void checkForDiscoverCard(){
	CreditCard card = new CreditCard();
	String result = card.cardCheck("6388576018402626");
	assertEquals("Discover Card",result);

}

	@Test
	public void checkForInvalidCard(){
	CreditCard card = new CreditCard();
	String result = card.cardCheck("2288576018402626");
	assertEquals("Invalid Card",result);

}

	@Test
	public void checkCardValidation(){
	CreditCard card = new CreditCard();
	String [] userinput = card.validateCard("4388576018410707");
	String [] feedback = {"Visa Card", "4388576018410707", "16", "Valid"};
	assertArrayEquals(feedback,userinput);
}


	@Test
	public void checkCardInvalidation(){
	CreditCard card = new CreditCard();
	String [] userinput = card.validateCard("4388576018402626");
	String [] feedback = {"Visa Card", "4388576018402626", "16", "Invalid"};
	assertArrayEquals(feedback,userinput);
}




	}	