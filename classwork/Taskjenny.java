import java.util.Scanner;
public class Taskjenny{
	public static void main(String[]args){


		Scanner sc= new Scanner(System.in);
		int number=0;
		int count= -1;
		while(number!=count){

		System.out.println("ENTER A NUMBER BETWEEN 1 AND 10 , OR -1 TO EXIST");

		 number= sc.nextInt();


		if(number==0)

			System.out.println("Zero ");

		else if (number==1)

			System.out.println("ONE");

		else if (number==2)
		
			System.out.println("TWO");
		
		else if (number==3)
		
			System.out.println("THREE ");

		else if (number==4)

			System.out.println("FOUR");

		else if (number==5)

			System.out.println("FIVE");

		else if (number==6)

			System.out.println("SIX");

		else if (number==7)

			System.out.println("SEVEN");

		else if (number==8)

			System.out.println("EIGHT");

		else if (number==9)

			System.out.println("NINE");

		else if (number==10)

			System.out.println("TEN");

		else
		
			System.out.println("invalid code");

		
}
}

}