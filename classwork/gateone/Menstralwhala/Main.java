import java.util.Scanner;
import java.util.Arrays;
public class Main{

	public static void main(String...args){
	System.out.println("Welcome to my family planning app");
	Scanner sc = new Scanner(System.in);
	int month;
	int date;
	int year;
	int periodOfFlow;
	int PeriodStartDate;
	int ovulationCycle;
	Menstrationapp app = new Menstrationapp();
	System.out.println("Enter your last month Menstral flow month eg 5 for may");
	month = sc.nextInt();
	System.out.println("Enter your last day Menstral flow month");
	date = sc.nextInt();
	System.out.println("Enter the year Menstral flow month eg 2013");
	year = sc.nextInt();
	int [] myDate = app.hostDate(month, date, year);
	int [] calendar = app.calendar(myDate);
	System.out.println("Enter the date you started your period, we want the day eg 7 ");
	PeriodStartDate = sc.nextInt();
	System.out.println("Enter how many days your menstral period lasted, eg 5 ");
	periodOfFlow = sc.nextInt();
	int [] flowdates = app.flowDate(PeriodStartDate,periodOfFlow,calendar);
	System.out.println("Enter your ovulation Cycle period \n");
	ovulationCycle = sc.nextInt();
	int ovulationDay = app.ovulationDate(ovulationCycle,calendar,PeriodStartDate,periodOfFlow);
	int [] unSafedDays = app.unSafedDays(ovulationDay,calendar);
	int [] safeDays = app.safeDays(ovulationDay,calendar,ovulationCycle,PeriodStartDate);
	System.out.println("your flowdays are \n" + Arrays.toString(flowdates));
	System.out.println("your ovulation day is " + ovulationDay );
	System.out.println("your unsafed periods for sex are " + Arrays.toString(unSafedDays));
	System.out.println("your safed periods for sex are " + Arrays.toString(safeDays));

}

}




	


	


		