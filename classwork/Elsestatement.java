import java.util.Scanner;
public class Elsestatement{

	public static void main(String[]args){

	Scanner sc= new Scanner(System.in);

	int number;

		System.out.println("ENTER YOUR SCORE");

			number= sc.nextInt();


		if(number >= 80) {
			System.out.println("you got A");
}		else if(number >= 70) {
			System.out.println("you got B");
}		else if(number >= 50) {
			System.out.println("you got C");
}
		else if(number < 49) {
			System.out.println("you got D");
}
}
}


				

				
		


