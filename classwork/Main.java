import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput= sc.nextInt();
	boolean check= Mysnack.Even(userinput);
	System.out.println(check);
	System.out.println("Enter a number");
	int input= sc.nextInt();
	boolean check1= Mysnack.isPrime(userinput);
			System.out.println(check1);
			

	System.out.println("Enter your first number");
		int num1= sc.nextInt();
	System.out.println("Enter your second number");
		int num2= sc.nextInt();
		int check2= Mysnack.subtract(num1,num2);
		System.out.println(check2);

	System.out.println("Enter your first number");
		int number1= sc.nextInt();
	System.out.println("Enter your second number");
		int number2= sc.nextInt();
	float check3= Mysnack.divide(number1,number2);
		System.out.printf("%f%n",check3);
		

		
		System.out.println("Enter a number");
			int digit= sc.nextInt();
		int check5= Mysnack.factors(digit);
		 System.out.println(check5);
	
		//System.out.println("Enter your base number");
		//int basenumber= sc.nextInt();
		//System.out.println("Enter your exponent number");
		//int exponentnumber= sc.nextInt();
		//double check6= Mysnack.square(basenumber,exponentnumber);
		//System.out.println();

		System.out.println("Enter set of integer number");
		int number3= sc.nextInt();
		boolean check7= Mysnack.palindrome(number3);
		System.out.println(check7);

		


			


	

	}

	}