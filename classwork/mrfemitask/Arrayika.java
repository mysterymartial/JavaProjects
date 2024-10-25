import java.util.Arrays;
public class Arrayika{

	public static void sortOut (int [] numbers){
		
	for(int count = 0; count < numbers.length; count++){

		for(int counter = count+1; counter < numbers.length; counter++){
			if(numbers[count] > numbers[counter]){
		
			numbers[count] = numbers[count] + numbers[counter];
			numbers[counter] = numbers[count] - numbers[counter];
			numbers[count] = numbers[count] - numbers[counter]; 
	}
	}
	}
	



			for(int value : numbers){

			System.out.print(value + " ");

}



}

  
		public static void main(String...args){
		
			int[] numbers = {9,4,3, -1};
			sortOut(numbers);
}

}					

					
				

		
		

	