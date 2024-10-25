
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;
public class BigDecimalPratice{

	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your loan amount");
	double loanAmount = sc.nextDouble();
	System.out.println("Enter your  repayment rate");
	double rates = sc.nextDouble();
	BigDecimal principal = BigDecimal.valueOf(loanAmount);
	System.out.println("Enter the years of payement ");
	int year = sc.nextInt();
	BigDecimal rate = BigDecimal.valueOf(rates);
	System.out.printf( "%s %20s %n","Year" , "Amount Deposited");
	for(int loop = 1; loop <= year; loop++){

		BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
		System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));

}

}
}

	