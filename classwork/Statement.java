import java.util.Scanner;
public class Statement{

	public static void main(String[]args){

	Scanner sc= new Scanner(System.in);

	int number;

		System.out.println("ENTER YOUR SCORE");

			number= sc.nextInt();


		if(number >= 80) {
			System.out.println("you got A");
}		if(number >= 70) {
			System.out.println("you got B");
}		if(number >= 50) {
			System.out.println("you got C");
}
		if(number < 49) {
			System.out.println("you got D");
}
}
}
		
	

	
