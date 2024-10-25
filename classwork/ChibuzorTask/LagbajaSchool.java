import java.util.Arrays;
import java.util.Scanner;
public class LagbajaSchool{

	public static void main(String...args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stundent in your class");
		int numberOfStudent = sc.nextInt();
		System.out.println("Enter the number of subject done by each student");
		int numberOfSubject = sc.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>");
		System.out.println("Saved Sucessfully");
		double sum = 0;
		int scores = 0;
		int average = 0;


		int [][] reportSheet = new int[numberOfStudent] [numberOfSubject];
		int [] total = new int [numberofStudent];
		for(int index = 0; index < reportSheet.length; index++){

			for(int counter= 0; counter < reportSheet[index].length; counter++){
				 
				System.out.printf("Enter the score of student %d%n",index+1);
				System.out.printf("Enter the score for subject %d%n", counter+1);
				reportSheet[index][counter] = sc.nextInt();
				
				System.out.println("Saving >>>>>>>>>>>>>>");
				System.out.println("Saved Sucessfully");
}				
}
				System.out.printf("%10s", "Student");
				for(int count =1; count <= numberOfSubject; count++){
					System.out.printf("%10s %d", "subject" , count);

					}
										
		
						System.out.println();
				for(int count = 1; count <= numberOfStudent; count++){
					System.out.printf("%10s %d%n", "student", count);
				
					} 
							
				for(int index = 0; index < reportSheet.length; index++){

				for(int counter= 0; counter < reportSheet[index].length; counter++){
					System.out.printf("%10d%n", reportSheet[index][counter]);
		

		}			
		
		}		 
					
					
									

				
				
								
							
		
			
		
		


	
}

}		

		