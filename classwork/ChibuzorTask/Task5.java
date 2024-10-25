import java.util.Arrays;
public class Task5{

	public static int [] evenPostion(int [] numbers){
		int counter = 0;
		for(int value : numbers){

			if (value % 2 == 0){

				counter++;


}

}
	
	int [] evenNumbers = new int [counter];
	int index =0;
	for(int number : numbers){
		if(number % 2 == 0){

			evenNumbers[index++] = number;

}

}

	return evenNumbers;

}


		public static void main(String...args){

		int [] numbers = {1,2,3,4,5};

		int result [] = evenPostion(numbers);
		

		System.out.println(Arrays.toString(result));

		
		


}

}
		

		