import java.util.Scanner;
public class Customeraccount{
	public static void main(String[]args){

            double accountNumber;
            double balance;
    	    double charges;
	    double totalCredit;
             double creditLimit;

                System.out.println("WELCOME TO MY ACCOUNT CHECK APP");
                Scanner sc= new Scanner(System.in);
   
                 int count=0;
         
               while(count!=10){
                 
				System.out.println("ENTER YOUR ACCOUNT NUMBER");
         			
					accountNumber= sc.nextDouble();

				

				System.out.println("ENTER YOUR ACCOUNT BALANCE FROM THE BEGINING OF THIS MONTH");
					balance= sc.nextDouble();

				System.out.println("ENTER THE TOTAL CHARGE OF ITEMS THIS MONTH");
					charges= sc.nextDouble();
	
				System.out.println("ENTER TOTAL CREDIT FOR THE MONTH");
   					totalCredit= sc.nextDouble();

				System.out.println("ENTER YOUR CREDIT LIMIT");
				
					creditLimit= sc.nextDouble();
               				count++;
     						
			
			
					

					if(totalCredit>=charges){
						System.out.println("YOU HAVE REACH YOUR TRANSACATION LIMIT");

						}

				      else{

						System.out.println("YOU HAVE NOT REACH TRANSACTION LIMIT");
							}
							
	    }

		
		}
		}