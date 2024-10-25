import java.util.Scanner;
public class Lagbaja{
	public static void main(String[]args){

	double sum1=0;
	double sum2=0;
	double sum3=0;
	double sum4=0;
	double average1=0;
	double average2=0;
	double average3=0;
	double average4=0;
	
	Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the number of your stundent in three subject");
			int number= sc.nextInt();

		double student1 []= new double [4];
		
		System.out.println("Enter the score of this stundent in mathematics");
			student1[0]= sc.nextDouble();
		
		System.out.println("Enter the score of this student in English");
			
			student1[1]= sc.nextDouble();

		System.out.println("Enter the score of this student in java");
				student1[2]= sc.nextDouble();

		
			for(int count=0; count<=3; count++){
				sum1+=student1[count];
				average1=sum1/count;

				
}

		System.out.println("your sum is " + sum1);
		System.out.println("your average is " + average1);



		double student2 []= new double [4];
		System.out.println("Enter the score of this stundent in mathematics");
			student2[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in English");
			student2[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in java");
			student2[0]= sc.nextDouble();

			for(int count=0; count<=3; count++){
				sum2+=student2[count];
				average2=sum2/count;
				

		
}

	System.out.println("your sum is " + sum2);
	System.out.println("your average is " +average2);

		

		

		double student3 []= new double [4];
		System.out.println("Enter the score of this stundent in mathematics");
			student3[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in English");
			student3[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in java");
			student3[0]= sc.nextDouble();

			for(int count=0; count<=3; count++){
				sum3+=student3[count];
				average3=sum3/count;


}

	System.out.println("your sum is " + sum3);
	System.out.println("your average is " + average3);





		double student4 []= new double [4];
		System.out.println("Enter the score of this stundent in mathematics");
			student4[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in English");
			student4[0]= sc.nextDouble();

		System.out.println("Enter the score of this stundent in java");
			student4[0]= sc.nextDouble();

			for(int count=0; count<=3; count++){
				sum4+=student4[count];
				average4= sum4/count;


}
				

				

		
	
	







System.out.println("your sum is " + sum4);
System.out.println("your average is " + average4);

	




}

}