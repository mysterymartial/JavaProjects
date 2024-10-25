import java.util.Scanner;
public class Singleor{
	public static void main(String[]args){


	int number= 0;

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
			number= sc.nextInt();

	if(number%3==0 && number % 5==0){
		

	System.out.printf("This number %d is divisible by 5 and 3", number);

	}
	else {
		System.out.println("your number is false");
	
	}


		

}

}