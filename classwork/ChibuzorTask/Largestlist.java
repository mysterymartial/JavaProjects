import java.util.Scanner;
public class Largestlist{

	public static int largest(int [] numbers){

		int large = 0;

		for(int value : numbers){

			if(value > large){

				large = value;

}

}

	return large;

}


	public static void main(String...args){

	int [] numbers ={1,2,3,4,70};
	int result = largest(numbers);
	System.out.println(result);

}

}
