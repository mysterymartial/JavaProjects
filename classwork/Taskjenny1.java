import java.util.Scanner;
public class Taskjenny1{
	public static void main(String[]args){


	int score= 0;
	int sum=0;

	Scanner sc= new Scanner(System.in);
	for(int count=1; count<=10; count++){

		System.out.println("Enter a score");

		score= sc.nextInt();
		 sum+=score;
		

	}
		


	System.out.println("Your sum is " + sum);
}

}