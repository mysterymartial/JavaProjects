public class CreditCard{

	public static int firstStep(String cardNumbers){
		int total =0;
		int result = 0;
		int sum =0;
		for(int count =cardNumbers.length()-2; count >= 0; count -=2){
			int numbers = Integer.parseInt(String.valueOf(cardNumbers.charAt(count)));
			numbers = (numbers *2);
			if(numbers >= 10){
				int firstDigit = numbers % 10;
				int secondDigit = numbers / 10;
				 sum = firstDigit + secondDigit;
				total = total + sum;
				}
				 else{
				total += numbers;
				
			}



	}		return total;

	}


		
		

		


	
		public static int secondStep(String cardNumbers){
		int sum =0;
			for(int counter = 0; counter < cardNumbers.length(); counter++){

			int numbers = Integer.parseInt(String.valueOf(cardNumbers.charAt(counter)));

					if(counter % 2 !=0){
					sum += numbers;
			
		
			}
		
			}

					
				return sum;
				
				
			}
		
		
		public String cardCheck(String cardNumbers) {
			char firstCard = cardNumbers.charAt(0);
			char secondCard = cardNumbers.charAt(0);
			char thirdCard1 = cardNumbers.charAt(0);
			char thirdCard2 = cardNumbers.charAt(1);
			char fourthCard = cardNumbers.charAt(0);
			
			int first = Integer.parseInt(String.valueOf(firstCard));
			int second = Integer.parseInt(String.valueOf(secondCard));
			int third1 = Integer.parseInt(String.valueOf(thirdCard1));
			int third2 = Integer.parseInt(String.valueOf(thirdCard2));
			int fourth = Integer.parseInt(String.valueOf(fourthCard));

			if(first == 4){
				return "Visa Card";
}

			else if(second == 5){
				return "Master Card";
}

			else if(third1 == 3 && third2 == 7){
				return "American Express Card";
}

		else if(fourth == 6){
			return "Discover Card";

}

		else{
			return "Invalid Card";

}
			
}
	public  String [] validateCard(String cardNumber){
		int value1 = firstStep(cardNumber);
		int value2 = secondStep(cardNumber);
		String cardType = cardCheck(cardNumber);
		int sumation = value1 + value2;
		int cardLength = cardNumber.length();
		String cardLen = String.valueOf(cardLength);
		String feedback = "";
			if(sumation % 10 == 0){
				feedback = "Valid";
		}

			else{
				feedback = "Invalid";

}

		String [] cardFeedback = { cardType, cardNumber, cardLen, feedback};

	return cardFeedback;
}
		
		
			

}			
				
				
			
	