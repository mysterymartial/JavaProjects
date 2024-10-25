
import java.util.Scanner;
public class Taskchi1{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Welcome my friend to my number factor checking app");
	
	
	int number= 0;
	int factor= 0;
	System.out.println("Enter a number and get the mutiple");
	number= sc.nextInt();
		for(int count=2; count<=number; count++){

		if(number % count == 0){
			
			factor++;

		System.out.println("The factors of your numbers are : "  + count);
			

			
		
			


		
}		
}

	System.out.printf("The number %d has this amount of %d factors", number, factor );
			
	
}
	

}

