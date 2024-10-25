//LET WEIGHT IN POUND BE P//
//LET WEIGHT IN KILOGRAM BE KG//
//MUTIPLY P BY 0.454//
//LABEL THE OUTPUT AS KG//

import java.util.Scanner;
public class Kilogram{
public static void main(Strings[]args){
float P,KG;
Scanner sc= new Scanner(System.in);
System.out.println("ENTER YOUR IN POUND");
P= sc.nextFloat();
KG= 0.454*P;
System.out.println("YOUR WEIGHT IN POUND IS " + KG);
}
}