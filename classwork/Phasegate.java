import java.util.Arrays;
public class Phasegate{

	public static void main(String[]args){
		int checker = 0;
		int counting = 0;
		int square;
		int smallest;
		int [] numbers = {-9, 5, 6 , 2, 1};
		
		for(int counter = 0; counter < numbers.length; counter++){
		
			 numbers[counter] = numbers[counter] * numbers[counter];
		
	

}

	for(int count = 0; count < numbers.length; count++){
		if(checker <= numbers[count]){
			smallest = checker;
}

	else{
		smallest = numbers[count];

		}
		
		counting = counting + 1;

	}

	
	System.out.println(Arrays.toString(numbers));



}

}			