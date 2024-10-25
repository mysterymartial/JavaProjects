import java.util.Scanner;
public class Percentpay{
	public static void main(String[]args){

	    float salesamount;
            double calc;
            float counter=0;
  
 	    System.out.println("WELCOME TO FAXS COMPANY WAGES CALCULATOR");

            Scanner sc= new Scanner(System.in);
            System.out.println("ENTER THE AMOUNT OF GOODS YOU SOLD");
             

                

                while(counter!=10){
                      salesamount= sc.nextFloat();
                      
                        calc= (salesamount*9/100);
       
     
         		System.out.println("YOUR EARNING IS " + calc);

                        System.out.println("ENTER THE AMOUNT OF THE NEXT ITEM");

                          
                        counter++;
           
                          
                     }

      
		}
		}

