import java.util.Scanner;
public class Taskj{
	public static void main(String[]args){


		System.out.println("Welcome to E-Banking App");

		int value=0;
		int number= 0;
		int sentenl= -1;

		Scanner sc= new Scanner(System.in);
		

		while(value!=sentenl){

		System.out.println("enter 1 number to get started or -1 to exit");
		value= sc.nextInt();

			
		
								
			switch(value){		


			
		case 1:
		String message= """
		1: Transfer
		2: Airtime
		3: Buy Data
		4: Share Data
		99: Go Back
			""";
			System.out.println(message);
			System.out.println("choose any of the number of the menu");
			number= sc.nextInt();
				break;
		
			

}
					



				
		

		
		  switch(number){

				System.out.println("enter 1 number to get started or -1 to exit");
				value= sc.nextInt();
		


			case 1:
				System.out.println("transfer");
					break;

			case 2:
				System.out.println("airtime");
					break;
			case 3:
				System.out.println("buy data");
					break;
			case 4:
				System.out.println("buy data");
					break;
			case 99:
				System.out.println("go back");
					break;		
		


		
		default:
			System.out.println("end of app");
				break;

		

			





				

			
			
			







  	

}			

}

}
}
