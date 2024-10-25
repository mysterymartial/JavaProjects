//LET ACCELERATION BE A//
//LET SPEED BE V//
//LET MINIMUM RUNAWAY LENGTH BE L//
//SQUARE V//
//MUTIPLY A BY 2 AND DIVIDE IT BY THE SQUARE OF V//
//LABEL THE OUTPUT AS L//

import java.lang.Math;
import java.util.Scanner;
public class Length{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int a,v,l;
System.out.println("ENTER YOUR ACCELERATION IN METER PER SECOND SQUARE");
a= sc.nextInt();
System.out.println("Enter YOUR SPEED IN METER PER SECOND");
v= sc.nextInt();
l= math.sqrt(v)/2*a;
System.out.println("THE MINIMUM RUNWAY LENGTH IS " + l );
}
}