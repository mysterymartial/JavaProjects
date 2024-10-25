import java.util.Scanner;
public class Bmiplay{
       public static void main(String[]args){

       
            float weight;
            float height;
            final int mik= 703;
            double bmi;

            Scanner sc= new Scanner(System.in);
            System.out.println("ENTER YOUR WEIGHT IN POUNDS");
            weight= sc.nextFloat();

            System.out.println("ENTER YOUR HEIGHT IN INCHES");
            height= sc.nextFloat();

            bmi= weight*mik/height*height;

            System.out.println("YOUR BMI IS " + bmi);
            

        }
     
       }