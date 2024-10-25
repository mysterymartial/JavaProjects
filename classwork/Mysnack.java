<<<<<<< HEAD
public class Mysnack{
	public static boolean Even(int number){

	int result= 0;
	
		
	for(int count=1; count<=10; count++){		
		
 	
		if(number % 2 == 0)return true;
                


}

 return false;

}


	public static boolean isPrime(int number){
	 
	for(int count=1; count<=number; count++){
		int prime= 1;
			

		if(number % count == 1)
			prime++;
			return true;

			 
	                
			
}
  			
		
		return false;

}


	public static int subtract(int num1,int num){
		int value1= num1-num;
		int value2= num-num1;
		if(num1>num)
		return value1;
		else
		return value2;
		

}




	public static int divide(int firstnumber, int secondnumber){
		int ans= firstnumber/secondnumber;
		   
		if(secondnumber==0)
			return 0;
	
		else
		   return ans;

}



	public static int factors(int number){
		int factor= 1;
		for(int count=2; count<=number; count++){

		if(number % count == 0)
			
			factor++;

			
}

		return factor;
}


	
	//public static boolean Square(int base,int exponent){

		//double power=1;
		//for(int i=0; i<exponent; i++){
		
		//power *=base;
		
		//}

		//return true;

//}







	public static boolean palindrome(int testnumber){
		int reverse= 0;
		int orgnumber=testnumber;
		
          while(testnumber!=0)
          {

         reverse=reverse*10 + testnumber%10;
         testnumber= testnumber/10;
	

            
        }

         if(orgnumber==reverse){
		return true;
}

	return false;

}

	public static long factoria(int number){
		long factorial=1;
	for(int i=1; i<=number; i++){

		factorial*= i;
	}

		return factorial;
	}

	

=======
public class Mysnack{
	public static boolean Even(int number){

	int result= 0;
	
		
	for(int count=1; count<=10; count++){		
		
 	
		if(number % 2 == 0)return true;
                


}

 return false;

}


	public static boolean isPrime(int number){
	 
	for(int count=1; count<=number; count++){
		int prime= 1;
			

		if(number % count == 1)
			prime++;
			return true;

			 
	                
			
}
  			
		
		return false;

}


	public static int subtract(int num1,int num){
		int value1= num1-num;
		int value2= num-num1;
		if(num1>num)
		return value1;
		else
		return value2;
		

}




	public static int divide(int firstnumber, int secondnumber){
		int ans= firstnumber/secondnumber;
		   
		if(secondnumber==0)
			return 0;
	
		else
		   return ans;

}



	public static int factors(int number){
		int factor= 1;
		for(int count=2; count<=number; count++){

		if(number % count == 0)
			
			factor++;

			
}

		return factor;
}


	
	//public static boolean Square(int base,int exponent){

		//double power=1;
		//for(int i=0; i<exponent; i++){
		
		//power *=base;
		
		//}

		//return true;

//}







	public static boolean palindrome(int testnumber){
		int reverse= 0;
		int orgnumber=testnumber;
		
          while(testnumber!=0)
          {

         reverse=reverse*10 + testnumber%10;
         testnumber= testnumber/10;
	

            
        }

         if(orgnumber==reverse){
		return true;
}

	return false;

}

	public static long factoria(int number){
		long factorial=1;
	for(int i=1; i<=number; i++){

		factorial*= i;
	}

		return factorial;
	}

	

>>>>>>> 1e515fbfa538a3483317b9f3be4f0791767e91d8
}