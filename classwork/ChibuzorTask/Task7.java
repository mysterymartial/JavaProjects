public class Task7{

	public static  boolean isPalindrome(String word){

		int left = 0;
		int right = word.length()-1;

		while(left < right){

			if(word.charAt(left) != word.charAt(right)){

				return false;

				}

				

				left++;

				right--;
				}

				return true;
			
					}



	public static void main(String...args){

		String [] names = { "radar", "bob", "pap", "long"};

		for(String run : names){
			
			if(isPalindrome(run)){
				System.out.println( run + " your name is a palindrome ");
				}

			else{
				System.out.println(run + " your name is not a palindrome ");
			}
}			
}

}