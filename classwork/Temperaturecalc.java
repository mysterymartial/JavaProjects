//LET Q BE ENERGY//
//LET M BE WEIGHT OF THE WATER IN KILOGRAM//
//LET I BE INTIAL TEMPERATURE//
//LET F BE FINAL TEMPERATURE//
//SUBTRACT F AND I AND MUTIPLY BY M//
//MUTIPLY THE OUTPUT BY 4184//
//LABEL THE OUTPUT AS Q//

import java.util.Scanner;
public class Temperaturecalc{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
float Q,M,I,F;
System.out.println(" ENTER THE WEIGHT OF THE WATER IN KILOGRAM");
M= sc.nextFloat();
System.out.println("ENTER THE INTIAL TEMPERATURE OF THE WATER");
I= sc.nextFloat();
System.out.println("ENTER THE FINAL TEMPERATURE OF THE WATER");
F= sc.nextFloat();
Q= M*(F-I)*4148;
System.out.println("THE ENERGY NEEDED TO HEAT YOUR WATER IS " + Q);


}
}