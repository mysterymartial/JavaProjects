import java.util.Scanner;
public class Whilestring{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		String name= "";

       		
		do{
  
          		System.out.print("ENTER YOUR NAME:");
	
		
				name= sc.nextLine();
  				}while(name.isBlank());
  

			
					System.out.println("HELLO " + name);
				
					

		
		}
		}