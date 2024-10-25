import java.util.Scanner;
public class CompoundInterest{

	public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	double loanAmount;
	int years;
	int counter = 1;

	System.out.println("Enter your loan amount");
		loanAmount = sc.nextDouble();

	System.out.println("Enter the monthly rate interest");
		double rate = sc.nextDouble();

	System.out.println("Enter the amount of years");
		years = sc.nextInt();

	System.out.printf("%10s %20s%n", "years", "loan amount");          

	double realRate = (rate/100);
	int monthly = (years *12);

	while(counter <= monthly){

		double month_increase = (realRate * loanAmount);

		loanAmount = month_increase + loanAmount;

		System.out.printf("%10d %20.2f%n", counter, loanAmount);

		
		counter++;
		
	
}	

	
}

}