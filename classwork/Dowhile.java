import java.util.Scanner;
public class Dowhile{
	public static void main(String[]args){
 
	int number;
	int secondnumber;
	int sum= 0;
  	char loop= 'c';

	System.out.println("Enter two number and it will added, type continue to add another two number");

		Scanner sc= new Scanner(System.in);


	do{

		

		System.out.println("ENTER THE FRIST NUMBER");
		 	number= sc.nextInt();

		System.out.println("ENTER YOUR SECOND NUMBER");
			secondnumber= sc.nextInt();
		

			sum= (number + secondnumber);

				
			System.out.printf("THE SUM %d OF THE NUMBERS IS : " , sum);
			
			System.out.println("Enter two number and it will added, type continue to add another two number");
				loop= sc.next().charAt(0);




					}while(loop=='c');

			
		System.out.println("Thanks for using my app");
				

			

	

	

	


		}

		}