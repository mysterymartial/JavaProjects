import java.util.Scanner;
public class Taskjenny8{
	public static void main(String[]args){

	int score=0;
	int sum=0;
	Scanner sc= new Scanner(System.in);
	
	
	for(int count=1; count<=10; count++){
		System.out.println("Enter a scores ");
		score= sc.nextInt();
			

		
				
		
		if (score>=100 ) 			
			System.out.println("you have entered a wrong value enter between 0 to 100");
				

	if(score<=100)

		sum+=score;
				
		

		
}


	System.out.println("the sum of the numbers between 0 qnd 100 is " + sum);
				




		

}

	

	




}