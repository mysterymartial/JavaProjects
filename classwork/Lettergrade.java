import java.util.Scanner;
public class Lettergrade{
       public static void main(String[]args){

           char grade;
           Scanner sc= new Scanner(System.in);
      System.out.println("ENTER ANYONE OF ALPHABET A B C D F");
      grade= sc.next().charAt(0);
    
      switch(grade){

           
   case 'A':
            System.out.println("THE NUMERIC VALUE FOR A IS  4 " );
             break;



 case 'B':
   
           System.out.println("THE NUMERIC VALUE FOR B IS 3 ");
             break;

case 'C':
        System.out.println("THE NUMERIC VALUE FOR C IS 2");
          break;

case 'D':
          System.out.println("THE NUMERIC VALUE FOR D IS 1");
           break;

 case 'F':
           System.out.println("THE NUMERI VALUE FOR F IS 0");
            break;

    default:

             System.out.println("YOU HAVE ENTERED A WRONG ALPHABET");

              }
      
    
      
      

      
        }
        }