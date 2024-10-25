import java.util.Arrays;
public class Sortarray{

	public static void sortOut (int [] numbers){
		int swap = 0;
		

	for(int count = 0; count < numbers.length; count++){

		for(int counter = count +1; counter < numbers.length; counter++){

			if(numbers[counter] < numbers[count]){
			
			swap = numbers[count];
			numbers[count] = numbers[counter];				
			 numbers[counter] = swap;

	}	
	}
	}



			for(int value : numbers){

			System.out.print(value + " ");

}



}


		public static void main(String...args){
		
			int[] numbers = {1,7,2,9};
			sortOut(numbers);
}

}