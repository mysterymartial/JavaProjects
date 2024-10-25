import java.util.Scanner;
public class Letterplay{
       public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        char till;
        System.out.println("ENTER ANY OF THE CHARACTER EQUILVALENT");
        till= sc.next().charAt(0);

         switch(till){

      case 'A':

                 System.out.println("THE EQULIVALENT OF ALPHABET A IS 0");
                  break;

     case 'B':
    
              System.out.println("THE EQULIVALENT OF ALPHABET B IS 1");

               break;

  case 'C':

           System.out.println("THE EQULIVALENT OF ALPHABET C IS 2 ");

            break;

  case 'a':

            System.out.println("THE EQULIVALENT OF THE ALPHABET a is $ ");
        
            break;

  case 'b': 
  
            System.out.println("THE EQULIVALENT OF THE ALPHABET b is * ");

            break;

 case 'c':

           System.out.println("THE EQULIVALENT OF THE ALPHABET c is + ");

            break;
default:

           System.out.println("it is a /");
        
            break;
 
 
            }

           }
   
          }