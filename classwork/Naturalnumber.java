import java.util.Scanner;
public class Naturalnumber{
	public static void main(String[]args){

	Scanner sc= new Scanner(System.in);

	int number= 1;
	
	int sum= 0;

		System.out.println("ENTER SERIES OF TEN NUMBER");

			for(int i=1; i<11; i++){

			number= sc.nextInt();
		
			sum += number;
			}

				System.out.println(" THE SUM OF INTEGER ENTERED  " + sum);
			

	
		}
			
		}