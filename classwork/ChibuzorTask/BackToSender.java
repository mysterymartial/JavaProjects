import java.util.Scanner;
public class BackToSender{
	

	public static int wages( int amount){
		int wage = (amount * 500) + 5000;

		return wage;



}



public static void main(String...args){
	String stopper = "";
	String sentinel = "no";
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to stop or yes to continue");
			 stopper = sc.nextLine();





		while(!stopper.equalsIgnoreCase(sentinel)){
			if(stopper.equalsIgnoreCase("yes")){

		System.out.println("Enter the amount of goods dispacthed for the day");

			int goods = sc.nextInt();

			int pay = wages(goods);

			System.out.println("your payment for the day  is "  + pay);

			

			
			
				



			}else{

				

			System.out.println(" Invalid input :Enter no to stop or yes to continue");
		}

			
			System.out.println("Enter no to stop or yes to continue");
			 stopper = sc.nextLine();




}

}

}		