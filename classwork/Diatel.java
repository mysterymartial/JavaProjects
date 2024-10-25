import java.util.Scanner;
public class Diatel{
	public static void main(String[]args){

           int number;
           int count= 0;
           int sum= 0;
           int integer=0;

    	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER ANY NUMBER");
		number= sc.nextInt();



   		
	while(sum !=number && sum < number){
		System.out.println("ENTER AN INTEGER NUMBER");

		integer= sc.nextInt();
		
		sum  +=  integer;
			}

			System.out.printf("YOUR NUMBER %d IS EQUAL OR LESS THAN THE SUM  %d %n  OF INTEGER   " ,   number ,   sum);

			

		




		}
		}