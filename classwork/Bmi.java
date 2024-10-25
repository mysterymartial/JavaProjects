//LET WEIGHT BE W//
//LET HEIGHT BE H//
//MULTIPLY W BY 0.4535937//
//LABEL OUTPUT TO BE WEIGHT IN KG//
//MULTIPLY H BY 0.0254//
//LABEL OUTPUT AS HEIGHT IN INCHES//
//DIVIDE W BY H SQUARE//
//LABEL OUTPUT AS BMI//

import java.util.Scanner;
public class Bmi{
public static void main(String[]args){
double w;
double h;
double weight;
double height;
double bmi;
Scanner sc= new Scanner(System.in);
System.out.println("ENTER YOUR WEIGHT IN POUND");
w= sc.nextFloat();
System.out.println("ENTER YOUR HEIGHT IN INCHES");
h= sc.nextFloat();
weight= w* 0.4535937;
height= h* 0.0254;
bmi= weight/height*height;
System.out.println(" YOUR BMI IS " + bmi);
 
}
}