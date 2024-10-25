import java.util.Scanner;
import java.util.Arrays;
public class Main{

	public static void main(String...args){

		Scanner sc = new Scanner(System.in);
		CreditCard card = new CreditCard();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Hi" + name);
		System.out.println("Enter your credit Card number");
		String creditCard = sc.next();
		String [] result = card.validateCard(creditCard);
		System.out.println("Credit card type: " + result[0]);
		System.out.println("Credit card number: " + result[1]);
		System.out.println("Credit card digit length: " + result[2]);
		System.out.println("Credit card validity status: " + result[3]);

}

}