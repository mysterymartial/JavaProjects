import java.util.Scanner;
public class Christmas{

	public static void main(String[]args){

	System.out.println("Welcome to my app, you will learn the lyrics of the twelve days of christmas today");

	Scanner sc= new Scanner(System.in);
	
	int learn= 12;
	int number= 0;
	int sentel= -1;
        int count= 0;

		System.out.println("Enter the number of verse you want to learn, starting from 0 to 12");

		while(count!=learn){
		
		number= sc.nextInt();
		number++;
			

		switch(learn){ 
		
		


  case 0:

	 System.out.println("On the frist day of christmas my true love sent to me"); 
	System.out.println("two turtle doves and a partridge in a pear tree");
	System.out.print(" three french hens two and partridge in a pear tree");

		break;


case 1:

	System.out.print("On the second day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;



case 2:

	System.out.print("On the third day of Christmas");
 	System.out.print("My true love sent to me");
	System.out.print("Three french hens");
 	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

 		break;


case 3:

	System.out.print("Four calling birds");
	System.out.print("On the fourth day of Christmas ,what's a calling bird");
	System.out.print("My true love sent to me");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;

case 4:

	System.out.println("Six geese a layin");
	System.out.print("On the sixth day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print(" a partridge in a pear tree!");


		break;


case 5:

	System.out.println("On the seventh day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;

case 6:

	System.out.println("Eight maids a milkin");
	System.out.print("On the eighth day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds ,calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;
case 7:

	System.out.println("Nine ladies dancin");
	System.out.print("On the ninth day of christmas");
	System.out.print("My true love sent to me");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;

case 8:

	System.out.println("Nine ladies dancin");
	System.out.print("On the ninth day of christmas");
	System.out.print("My true love sent to me");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree");

		break;


case 9:

	System.out.println("Ten lords a leapin");
	System.out.print("On the tenth day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Ten lords a leapin");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree");

		break;

case 10:

	System.out.println("Ten lords a leapin");
	System.out.print("On the tenth day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Ten lords a leapin");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");

		break;

case 11:

	System.out.println("Eleven pipers pipin");
	System.out.print("On the eleventh day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Eleven pipers pipin");
	System.out.print("Ten lords a leapin");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids a milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree!");
	
		break;

case 12:

	System.out.println("Twelve drummers drummin");
	System.out.print("On the twelfth day of Christmas");
	System.out.print("My true love sent to me");
	System.out.print("Twelve drummers drummin");
	System.out.print("Eleven pipers pipin");
	System.out.print("Ten lords a leapin");
	System.out.print("Nine ladies dancin");
	System.out.print("Eight maids milkin");
	System.out.print("Seven swans a swimmin");
	System.out.print("Six geese a layin");
	System.out.print("Five golden rings");
	System.out.print("Four calling birds");
	System.out.print("Three french hens");
	System.out.print("Two turtle doves");
	System.out.print("And a partridge in a pear tree");
		break;

		

default:

	System.out.println("you have exceed the number of verse the song has");

		}


		}


		}
		}



      
