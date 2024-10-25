import java.util.Scanner;

public class Mytrip{

public static void main(String [] args){

float distance; 
float gallonused; 
float price;
double total;


Scanner sc= new Scanner(System.in);

System.out.println("ENTER YOUR DISTANCE");
 distance= sc.nextFloat();
System.out.println("ENTER TOTAL AMOUNT OF GALLONS USED PER MILE");
 gallonused = sc.nextFloat();
System.out.println("ENTER THE PRICE PER GALLON");
 price= sc.nextFloat();
total= distance/gallonused*price;
System.out.println( "THE COST OF DRIVING IS " + total);
}
}