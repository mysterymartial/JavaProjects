import java.util.Scanner;
public class Classwork1{
	public static void main(String[]args){

		int number=0;
		int sum=0;
		Scanner sc= new Scanner(System.in);
	
		for(int count=1; count<=10; count++){

			System.out.println("Enter a score");
			number= sc.nextInt();
			
			if(count % 2!= 0)
		
			sum+=number;
		


}

	System.out.println("the sum of odd indices is " + sum);

}

}

			
		