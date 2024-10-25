import java.util.Scanner;
public class Integerplay{
       public static void main(String[]args){

       int value1= 0;
       int value2= 0;
       int value3= 0;
       int number;
       int sum;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter an interger between 0 and 1000");
       number= sc.nextInt();
       
        if(number>0 && number<1000){
    
             value1= (number%10);
             number= (number%10);
             
             value2= (number%10);
             number= (number%10);

             value3= (number%10);
             number= (number%10);
             sum= value1 + value2 + value3;
             
             
             System.out.println("THE SUM OF ALL THE DIGITS IN THE INTEGER IS " + sum);
                     }
      else{

                    
                  System.out.println("ENTER A NUMBER BETWEEN 0 AND 1000");
                       }
               
           
                  }

                    }


  
       
      
    
        
       
             
            

      