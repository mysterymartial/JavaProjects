import java.util.Scanner;
public class Gradecheck{
       public static void main(String[]args){

;
    
       Scanner sc= new Scanner(System.in);
 
       char grade;
       System.out.println("Enter any alphabet between A B C D F");
       grade= sc.next().charAt(0);
      switch(grade){

      case 'A':
                System.out.println("THE NUMERIC VALUE FOR A IS 4 " );
                 break;


 case 'B':

         System.out.println("THE NUMERIC VALUE FOR B IS 3");
          break;

case 'C':
         System.out.println("THE NUMERIC VALUE FOR C IS 2 ");
           break;

case 'D':
         System.out.println("THE NUMERIC VALUE FOR D IS 1");
          break;
case 'F':

         System.out.println("THE NUMERIC VALUE FOR F IS 0");
         break;
default:
        System.out.println("YOU ENTERED A WRONG ALHPHABET");
         break;
   }
}
   }