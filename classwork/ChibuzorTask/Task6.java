public class Task6{

	public static int total(int [] numbers){

		int sum = 0;

		for(int value : numbers){

			sum += value;


}

	return sum;

}


	public static void main(String...args){

		int [] numbers = {1,2,3,4,5};
	
		int result = total(numbers);
		System.out.println(result);




}

}			

