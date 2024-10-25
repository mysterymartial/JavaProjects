import java.util .Arrays;
public class Menstrationapp{

	public int [] hostDate( int month, int day, int year){ 
		int monthEnd;
		if(month == 2 && day == 29){
			monthEnd = 29;
		}else{
			monthEnd = 28;
		}

		int [] daysOfMonth = {0,31,monthEnd,31,30,31,30,31,31,30,31,30,31};
		int []monthOfTheEntry = new int[2];

		final int myArrayLength = daysOfMonth.length;

			if(month == 12){
				int size = daysOfMonth[12];
				monthOfTheEntry[0] = size;
				monthOfTheEntry[1] = daysOfMonth[1];

						
			}
			else if(month < 12){
	
			int firstMonthSize = daysOfMonth[month];
			monthOfTheEntry[0] = firstMonthSize;
			int secondMonthSize = daysOfMonth[month + 1];
			monthOfTheEntry[1] = secondMonthSize;

			
			}

			return monthOfTheEntry;

}

 	public int [] calendar(int [] daysOfTwoMonth){
		int number = 1;
		int sum = daysOfTwoMonth[0] + daysOfTwoMonth[1];
		int [] totalDays = new int [sum];
		for(int counter =0; counter < totalDays.length; counter++){
			if(counter != daysOfTwoMonth[0]){
		
				totalDays[counter] = number;
				number++;
		}else{
			number = 1;
			
				totalDays[counter] = number;
					number++;
		}

		}
	return totalDays;

}

	public int [] flowDate(int startDay, int periodOfFlow, int []calenderOfTwoMonths){
		int flowDateIndex = 0;
		int [] flowDays = new int[periodOfFlow];  
		for(int counter = startDay-1; counter < calenderOfTwoMonths.length; counter++){
			if (flowDateIndex == 5){
				counter = calenderOfTwoMonths.length;
			} else {
				int flowDate = calenderOfTwoMonths[counter];
				flowDays[flowDateIndex] = flowDate;
				flowDateIndex++;
			}

}

	return flowDays;
}			

	public int ovulationDate(int ovulationCycleTime, int []calenderOfTwoMonths, int startDay, int periodOfTime){
		final int timeConsant = 14;
		final int ovaulationCalc = (ovulationCycleTime - timeConsant);
		int period = startDay + (periodOfTime - 1);
		int count = (period -1);
		int counter = count +1;
		int ovulationDay = 0;
		int ovulationIndex = 0;

		for(int index = counter; index <= calenderOfTwoMonths.length; index++){
			if(ovulationIndex == ovaulationCalc){
				counter = calenderOfTwoMonths.length;
			}else{
				ovulationDay = calenderOfTwoMonths[index];
				ovulationIndex++;
}
 }

		return ovulationDay;
}

				
	public int [] unSafedDays(int ovulation, int []calenderOfTwoMonths){
		final int calenderLen = calenderOfTwoMonths.length;
		final int unSafeDayConst = 8; 
		final int unSafeDayLen = unSafeDayConst +1;

		int lastUnSafeDay = (ovulation +2);
		int firstUnSafeDay = lastUnSafeDay - unSafeDayConst;
		int count = firstUnSafeDay - 1;
		int unSafeDayIndex = 0;
		int [] unSafeDays = new int[unSafeDayLen];
		int unSafeDates = 0;
		for(int index = count; index < calenderOfTwoMonths.length; index++){
			if(unSafeDayIndex == unSafeDayLen){
				count = calenderOfTwoMonths.length;
				}else{
					unSafeDates = calenderOfTwoMonths[index];
					unSafeDays[unSafeDayIndex] = unSafeDates;
					unSafeDayIndex++;
			}
}

		
			return unSafeDays;
}
		

		
						
	public int [] safeDays(int ovulation, int []calenderOfTwoMonths, int menstralCycle, int day ){
		final int unsafeDaysConstant =	8;
		int lastUnsafeDays= (ovulation +2);
		int indexOfLastDay = lastUnsafeDays - 1;
		int firstUnSafeDay = lastUnsafeDays - unsafeDaysConstant;
		int firstCounter = firstUnSafeDay - 1;
		int indexFristDay = day - 1;
		int unsafeDaysLength = 9;
		final int safeDayLen = menstralCycle - unsafeDaysLength;
		int [] safeDays = new int [safeDayLen];
		int unSafeDates = 0;
		int indexOfUnSafeDays = 0;

		for(int index = 0; index < safeDays.length; index++){
			
			if(indexFristDay == firstCounter){ 
				indexFristDay = (indexOfLastDay + 1);
				unSafeDates = calenderOfTwoMonths[indexFristDay];
				safeDays[indexOfUnSafeDays] = unSafeDates;
			}else{
				unSafeDates = calenderOfTwoMonths[indexFristDay];
				safeDays[indexOfUnSafeDays] = unSafeDates;
			}
			indexFristDay++; 
			indexOfUnSafeDays++;
			 

}		
		return safeDays;
}
					
		
		
	 	
		
		
		
				

				
}			