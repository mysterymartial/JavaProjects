//LET M BE NUMBER OF MINIUTES//
//LET D BE NUMBER OF DAYS//
//LET Y BE NUMBER OF YEARS//
//DIVIDE M BY 1440//
//LABEL YOUR OUTPUT D//
//DIVIDE M BY 525600//
//LABEL YOUR OUTPUT AS Y//

import java.util.Scanner;
public class Time{
public static void main(String[]args){
int M,D,Y;
Scanner sc= new Scanner(System.in);
System.out.println("ENTER YOUR MINITUES");
M= sc.nextInt();
D= M/1440;
Y= M/525600;
System.out.println("THE NUMBER OF DAYS IS " + D);
System.out.println( "THE NUMBERS OF YEARS IS " + Y);
}
}

