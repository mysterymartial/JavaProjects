import java.util.Scanner;
public class Country{
       public static void main(String[]args){

       		Scanner sc= new Scanner(System.in);
      		 System.out.println("ENTER THREE COUNTRIES OF YOUR CHOICE");

       String countrya;
       String countryb;
       String countryc;

       System.out.println("ENTER YOUR FIRST COUNTRY");
       countrya= sc.nextLine();
       System.out.println("ENTER YOUR SECOND COUNTRY");
       countryb= sc.nextLine();
       System.out.println("ENTER YOUR THIRD COUNTRY");
       countryc= sc.nextLine();

       System.out.printf("%s %s %s" , countryc, countryb, countrya);


       
       

          }
          }