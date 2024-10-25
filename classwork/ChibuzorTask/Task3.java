public class Task3{

	public static boolean occurance(int []list, int prototype){
	
		for(int value : list){
		
			if(value == prototype){
		
				return true;


			}

			}

				return false;








}


	public static void main(String...args){
	
		int [] numbers = {1,2,3,4,5};

		boolean result = occurance(numbers, 2);

		System.out.println(result);
		
}

}