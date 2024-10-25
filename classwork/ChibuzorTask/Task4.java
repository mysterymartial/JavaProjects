public class Task4{

	public static int [] oddPostion(int [] numbers){
		int counter = 0;
		for(int value : numbers){

			if (value % 2 != 0){

				counter++;


}

}
	
	int [] oddNumbers = new int [counter];
	int index =0;
	for(int number : numbers){
		if(number % 2 != 0){

			oddNumbers[index++] = number;

}

}

	return oddNumbers;

}


		public static void main(String...args){

		int [] numbers = {1,2,3,4,5};

		int result [] = oddPostion(numbers);
		for(int number : result){

		System.out.println(number + " ");

		
		
}

}

}
		

		