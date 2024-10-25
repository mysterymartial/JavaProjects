import java.util.Scanner;
public class Tasklit  {
	public static void main(String[]args){

	int number= 0;
	int sentel= -1;
	int sum= 0;
	
	
	Scanner sc= new Scanner(System.in);
	
	do{
	

		System.out.println("enter ten scores, or enter -1 to exist ");
		number= sc.nextInt();
		sum += number;
		

		}while(number==sentel);
	



		


		System.out.println("your sum is " + sum);

}

}