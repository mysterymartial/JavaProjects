import java.util.Scanner;
public class Taskjenny3{
	public static void main(String[]args){


	int score= 0;
	int average=0;
	int sum=0;

	Scanner sc= new Scanner(System.in);
	for(int count=1; count<=10; count++){

		System.out.println("Enter a score");

		score= sc.nextInt();

		sum+=score;
		average= sum/count;

		

	}
		


	
	System.out.println("Your avaerage is " + average);
	System.out.println("Your sum is " + sum);



}

}