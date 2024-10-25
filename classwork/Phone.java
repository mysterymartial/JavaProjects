import java.util.Scanner;
public class Phone {
       public static void main(String[]args){

          Scanner sc= new Scanner(System.in);
          char button;

          System.out.println("enter your alphabet");
          button= sc.next().charAt(0);

          switch(button){

           
case 'A':
case 'a':
case 'B':
case 'b':
case 'C':
case 'c':
         System.out.println("THE CORRESPONDING NUMBER IS 2");
          break;


case 'D':
case 'd':
case 'E':
case 'e':
case 'F':
case 'f':
          System.out.println("THE CORRESPONDING NUMBER IS 3");
          break;

case 'G':
case 'g':
case 'H':
case 'h':
case 'I':
case 'i':
          System.out.println("THE CORRESPONDING NUMBER IS 4");
            break;

case 'J':
case 'j':
case 'K':
case 'k':
case 'L':
case 'l':
          System.out.println("THE CORRESPONDING NUMBER IS 5");
            break;

case 'M':
case 'm':
case 'N':
case 'n':
case 'O':
case 'o':
         System.out.println("THE CORRESPONDING NUMBER IS 6");
          break;

case 'P':
case 'p':
case 'Q':
case 'q':
case 'R':
case 'r':
case 'S':
case 's':
         System.out.println("THE CORRESPONDING NUMBER IS 7");
           break;

case 'T':
case 't':
case 'U':
case 'u':
case 'V':
case 'v':
          System.out.println("THE CORRESPONDING NUMBER IS 8");
            break;

case 'W':
case 'w':
case 'X':
case 'x':
case 'Y':
case 'y':
case 'Z':
case 'z':
             System.out.println("THE CORRSPONDING NUMBER IS 9");
              break;
case ',':
case '.':
         System.out.println("THE CORRESPONDING NUMBER IS 1");
          break;

case '*':
         System.out.println("THE CORRESPONDING NUMBER IS *");
          break;

case '+':
case '-':
          System.out.println("THE CORRESPONDING NUMBER IS 0");
           break;

case '#':
         System.out.println("THE CORRESPONDING NUMBER IS #");
          break;

default:

        System.out.println("ENTER AN ALPHABET ON THE PHONE");
         break;
       
       }
          
        }
        }