//LET FEET VALUE BE X//
//LET METER VALUE BE M//
//DIVIDE 1 BY 3.28084 AND MUTIPLY BY M//
//LABEL YOUR OUTPUT TO BE M//

import java.util.Scanner;
public class Converter{
public static void main(String[]args){
double x,m;
Scanner sc= new Scanner (System.in);
System.out.println("ENTER YOUR HEIGHT FEET");
x= sc.nextDouble();
m= 0.305*x;
System.out.println(" YOUR HEIGHT IN FEET IS " + m);

}
}