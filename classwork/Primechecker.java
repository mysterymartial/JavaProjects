import java.util.Scanner;
public class Primechecker{
	public static void main(String[]args){

		int number=0;
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a natural number");
			num= sc.nextInt();

		if(isPrime(num))
			System.out.println(number  + " it is a prime number");

				
		

		else
			System.out.println(number + " it is not a prime number");

						
			

			public  static boolean isPrime (int number) {
		
				if(number<=1){
		
					return false;
}
			
		for(int count=2; count<=Math.sqrt(num); i++){

			if(num % count==0){
			
		
			   return false;

			}
			}


				return true;
}
}
}