import java.util.Scanner;
public class Taskjenny6{
	public static void main(String[]args){

	int number;
	int sum=0;
	int average=0;
	Scanner sc= new Scanner(System.in);
	
	for(int count=1; count<=10; count++){
		System.out.println("Enter a score ");

		
		number= sc.nextInt();
 	

		if(number % 2 == 0)
					
		
		sum+=number;
		average= sum/count;
		

}

	

	System.out.println("The average of the even is " + average);



}

}