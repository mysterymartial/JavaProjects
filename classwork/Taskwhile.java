import java.util.Scanner;
public class Taskwhile{
	public static void main(String[]args){

	int number= 0;
	
	
	double sum= 0;
		Scanner sc= new Scanner(System.in);
	
		

		for(int count=1; count<=10; count++){
		System.out.println("enter ten scores");
		number= sc.nextInt();


	
		sum += number;
		
		 
			



		}


		System.out.println("your sum is " + sum);

}

}