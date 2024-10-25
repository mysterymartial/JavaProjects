public class Task8{

	public static int forTotal(int [] numbers){
	
		int total = 0;

		for(int values : numbers){
			total += values;

		}


		return total;

		}




	public static int whileTotal(int [] numbers){

		int total = 0;
		int counter = 0;

		while (counter < numbers.length){
	
			total += numbers[counter];

			counter++;

		}

		return total;

		}


		public static int doWhileTotal(int [] numbers){

			int total =0;
			int counter = 0;

			do{

				total += numbers[counter];

				counter++;

			}while(counter < numbers.length);
		
				return total;

				}


		public static void main(String...args){

		int [] numbers = {1,2,3,4,5};
		int result = forTotal(numbers);
		int result1 = whileTotal(numbers);
		int result2 = doWhileTotal(numbers);

		System.out.println(result);

		System.out.println(result1);
		System.out.println(result2);

}

}




			

			