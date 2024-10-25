import java.util.Scanner;
public class KataKata{

	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		String numbers= "";
		

		for(int count= 0; count < 10; count++){
		
			System.out.println("Enter a set of number" + (count + 1));

			int number= sc.nextInt();
			numbers += number;
			if(count<9)
				numbers+= ", ";
		
	}




		 System.out.println(numbers);

	
		String[] bytes = numbers.split(", ");
		int sum = 0;
		for(int counter=0; counter<bytes.length; counter++){
			String num = bytes[counter];
			int number = Integer.parseInt(num);
				sum += number;

}


		System.out.println("sum of numbers is: " + sum);



}


}

