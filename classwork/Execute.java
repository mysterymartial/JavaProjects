import java.util.Scanner;
public class Execute{
	public static void main(String...args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount of pacakage delivered today");
			int userinput= sc.nextInt();
			int payment= Senderapp.sender(userinput); 
			System.out.println(payment);



}
	


}	