import java.util.Arrays;
public class Arrayplay2{

		public static void main(String[]args){
		
		int []arr = {5,7,2,3,1};
		int temp = 0;

	for(int count = 0; count < arr.length; count++){

		for(int counter = count + 1; counter < arr.length; counter++){
		
			if(arr[counter] < arr[count]){
			
	
				temp = arr[count];
				arr[count] = arr[counter];
				arr[counter] = temp;



}

}

}

		for(int value : arr){
		System.out.print(value);
}

 

}

}




