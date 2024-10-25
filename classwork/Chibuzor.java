import java.util.Scanner;
public class Chibuzor{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		int number;
		int postivecount= 0;
		int negativecount= 0;
		int zerocount= 0;
		final int sentel= -1;
				System.out.println("Enter a number , enter -1 to stop");
					number= sc.nextInt();

			while(number != -1){

				


			if(number>0){
				postivecount++;
			
				}

			else if(number<0){
	
				negativecount++;

					}

			else {

				zerocount++;
				
					}

			System.out.println("Enter a number , enter -1 to stop");
					number= sc.nextInt();

					}

			System.out.println("Postive number are :  " + postivecount);
			System.out.println("Negative numbers are: " + negativecount);
			System.out.println("Zeros entered is : " + zerocount);
			
					
		
			}

		
			}