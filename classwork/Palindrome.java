import java.util.Scanner;
public class Palindrome{
       public static void main(String[]args){
      
         int digit;
         int number;
       
 
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any three digits");
       number= sc.nextInt();
       
         digit= number%10;
          number= number/100;
           
                  
                      
       if(digit==number){
             System.out.println("YOUR NUMBER IS PALINDROME");
               }

       else  {
             
             
            System.out.print("YOUR NUMBER IS not PALINDROME");
           
           }
      
         

      
       

       
         }
         }