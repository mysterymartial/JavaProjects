public class ReversedArray{
    public static int reverseArray(int[] numbers) {
        int begin = 0;
        int end = numbers.length - 1;
	int reverse = 0;
        while (begin < end) {
            int temp = numbers[begin];
            numbers[begin] = numbers[end];
            numbers[end] = temp;
            begin++;
            reverse = end--;


 }

	return reverse;	


}

	
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        for (int value : numbers) {
            System.out.print(value + " ");  
   

}

}

	
	

}

