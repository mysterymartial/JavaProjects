import java.util.Scanner;
public class Mytable{
 	public static void main(String[]args){
      
         Scanner sc= new Scanner(System.in);
		int number;
		int square;
		int cube;
		int power4;
		int count= 0;


         System.out.println("ENTER A NUMBER");


         while(count!=10){
		number= sc.nextInt();

		square= (number*number);
		cube=   (number*number*number);
		power4= (number*number*number*number);

			System.out.println("N            N^2       N^3          N^4");

          		System.out.printf(" %d            %d        %d           %d ",  number, square, cube, power4);

				}  

		
		}
		}