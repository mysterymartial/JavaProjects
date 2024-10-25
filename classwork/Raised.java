import java.util.Scanner;

public class Raised{
	public static void mymethod(){

	
  		int num1;
		int num2;
		int power= 1;
		

		Scanner sc= new Scanner(System.in);
         	System.out.println("enter your first number");

		num1= sc.nextInt();

		System.out.println("enter your second number");
		num2= sc.nextInt();

	for(int i=0; i<num2; i++){
		
		power *=num2;
		
		}
		
			System.out.println("the square of the number is " + power);
		
				}

		

		public static void main(String[]args){
		
			mymethod();

			}
		


			}


		