import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MenstrationappTest{

	@Test
	public void testToCheckDateEntered() {
		Menstrationapp app = new Menstrationapp();
		int [] result = app.hostDate(5,16,2010);
		int [] calendarMonth = {31,30};
		assertArrayEquals(calendarMonth,result);

}
	@Test
	public void checkingCalenderLength(){

	Menstrationapp app = new Menstrationapp();
		int[] daysOfTwoMonth= {31,30};
		int[] calenderOfTwoMonths={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int [] result = app.calendar(daysOfTwoMonth);
	assertArrayEquals(calenderOfTwoMonths,result);
}

	@Test
	public void checkingFlowDates(){
	Menstrationapp app = new Menstrationapp();
	int[] calenderOfTwoMonths={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
int [] feedback = {3,4,5,6,7};
int [] result = app.flowDate(3,5,calenderOfTwoMonths);
assertArrayEquals(feedback,result);
}

	@Test
	public void checkingOvaulationDate(){
	Menstrationapp app = new Menstrationapp();
	int[] calenderOfTwoMonths={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
int result = app.ovulationDate(28,calenderOfTwoMonths,7,5);
assertEquals(25, result);
}

	@Test
	public void checkingUnSafeDays(){
	Menstrationapp app = new Menstrationapp();
	int[] calenderOfTwoMonths={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
int [] feedback = {19,20,21,22,23,24,25,26,27};
int [] result = app.unSafedDays(25, calenderOfTwoMonths);
assertArrayEquals(feedback, result);
}
	
	@Test
	public void checkingSafeDays(){
	Menstrationapp app = new Menstrationapp();
	int[] calenderOfTwoMonths={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
int [] feedback = {7,8,9,10,11,12,13,14,15,16,17,18,28,29,30,31,1,2,3};
int [] result = app.safeDays(25,calenderOfTwoMonths,28,7);
assertArrayEquals(feedback, result);

}
		
	
}