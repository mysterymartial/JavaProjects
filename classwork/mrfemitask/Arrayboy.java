public class Arrayboy{

	public static void sortOut(int [] numbers){

		for(int index =0; index < numbers.length; index++){

			for(int counter = index+1; counter < numbers.length; counter++){

		
				if(numbers[index] > numbers[counter]){

					numbers[index] = numbers[index] + numbers[counter];
					numbers[counter] = numbers[index] - numbers[counter];
					numbers[index] = numbers[index] - numbers[counter];

}

}

}


		for(int values : numbers){

			System.out.print(values +  " ");

}

}


		public static void main(String...args){

			int [] numbers = {6,1,90,3,-1};

			sortOut(numbers);

}

}