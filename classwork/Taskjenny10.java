import java.util.Scanner;
public class Taskjenny10{
	public static void main(String[]args){

	int score=0;
	int sum=0;
	int average=0;
	Scanner sc= new Scanner(System.in);
	
	
	for(int count=1; count<=10; count++){
		System.out.println("Enter a scores ");
		score= sc.nextInt();
			

		
				
		
		if (score>=100 ) 			
			continue;
	if(score<=100)

		sum+=score;
				
		average= sum/count;

		
}


		System.out.println("the average of the numbers between 0 qnd 100 is " + average);
				





		

}

	

	




}