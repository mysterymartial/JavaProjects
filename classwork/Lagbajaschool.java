import java.util.Scanner;
public class Lagbajaschool{

	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		int sum= 0;
		int average= 0;
		int student [] = new int [student.size];
		for(int count= 0; count<=student.size; count++){
		System.out.println("Enter the number of sudent in your class");
		student[] = sc.nextInt();

}
		System.out.println("Saved");
		
		double student1 []= new double [4];
		
		System.out.println("Enter the score of this stundent in mathematics");
			student1[0]= sc.nextDouble();
		
		System.out.println("Enter the score of this student in English");
			
			student1[1]= sc.nextDouble();

		System.out.println("Enter the score of this student in java");
				student1[2]= sc.nextDouble();

		
			for(int count=0; count<=3; count++){
				sum+=student1[count];
				average=sum/count;

				
}

		System.out.println("your sum is " + sum);
		System.out.println("your average is " + average);


		
		
}

}		