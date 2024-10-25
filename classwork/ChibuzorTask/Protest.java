import java.security.SecureRandom;
import java.util.Scanner;
public class Protest{

	public String protestResult(){

		SecureRandom random = new SecureRandom();

		String [] question = {"end hunger", "end eletion malpratices", "increase salary", "end tinubu", "end Bad Governance","we want tinubu","protest will lead to killings","the people protesting are foolish", "bribe us", "give us peter obi" };
		
		int rand = 1+random.nextInt(10);

		String feedback = question[rand];

		return feedback;

}


	public static void main(String...args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("How old are you");
		int age = sc.nextInt();
		Protest pro = new Protest();
		String result = pro.protestResult();

		System.out.println("this is part of the demand of our protesters "  + result);

}

}
		
		