import java.util.Scanner;
public class Main{

	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	String response = "";
	String [] answer = new String[20]; 
	System.out.println("what is your name");
	String name = sc.next();
	System.out.printf("Welcome  %s to my myer briggs test \n", name );
	Mbti quiz = new Mbti();
	String [] question = quiz.questions();

	for(int counter = 0; counter < question.length; counter++){
		System.out.println(question[counter]);
		System.out.print("Enter A or B:  ");
		response = sc.next();
		if(!response.equals("A") && !response.equals("a") && !response.equals("B") && !response.equals("b")) {
			boolean flag = true;
			while(flag) {
				System.out.print("Enter A or B:  ");
				response = sc.next();	
				if(response.equals("A") || response.equals("a") || response.equals("B") || response.equals("b")) {
					flag = false;
				}
			}
		}

		answer[counter] = response;
				 
		}
	

	String firstResponse = quiz.getFirstResponse(answer);
	String secondResponse = quiz.getSecondResponse(answer);
	String thirdResponse = quiz.getThirdResponse(answer);
	String fourthResponse = quiz.getFourthResponse(answer);

	String message = quiz.getPersonality(firstResponse, secondResponse, thirdResponse, fourthResponse);

	System.out.print(message);

	
	
		
}

}

		
	
	

	