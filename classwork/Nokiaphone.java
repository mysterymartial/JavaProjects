import java.util.Scanner;
public class Nokiaphone{
	public static void main(String[]args){
		System.out.println("Welcome to my nokia phone");

		Scanner sc= new Scanner(System.in);
		int menu= 0;
		int phonebook= 0;
		int option= 0;
		int sms= 0;
		int messageSetting= 0;
		int square1= 0;
		int common= 0;
		int callregister= 0;
		int callduration= 0;
		int cost= 0;
		int costsetting= 0;
		int tones= 0;
		int setting= 0;
		int callsetting= 0;
		int phonesetting= 0;
		int securitysetting= 0;
		int clock= 0;
		System.out.println("Enter a number");  
		menu= sc.nextInt();

	switch(menu){

	case 1:
	
		String message= """
		1:phonebook
		2:message
		3:chat
		4:call register
		5:tones
		6:setting
		7:call divert
		8:game
		9:calculator
		10:reminder
		11:clock
		12:profile
		13:sim service
			""";

			System.out.println(message);
			System.out.println("choose one of the number to select your desired menu");
				menu= sc.nextInt();
			System.out.println("navigate to your desired menu in the phone book");
				phonebook= sc.nextInt();
				
			
			switch(phonebook){
			case 1:
			
			
			String luck= """
			1:search
			2:services nos
			3:add name
			4:erase
			5:edit
			6:assign tone
			7:send b card
			8:option
			9:speed dial
			10:voice tags
				""";
			System.out.println(luck);
			System.out.println("search");
				break;

		

		case 2:
			System.out.println("services nos");
				break;

		case 3:
			System.out.println("Add name");
				break;

		case 4:
			System.out.println("Erase");
				break;

		case 5:
			System.out.println("Edit");
				break;
		case 6:
			System.out.println("Assign tone");
				break;

		case 7:
			System.out.println("send b card");
				break;

		case 8:
			System.out.println("option");
				
			String var1= """
			1:type of view
			2:memory status
				""";
			System.out.println(var1);
			System.out.println("choose on of the option");
			option= sc.nextInt();
			
			

			switch(option){
			case 1: System.out.println("type of view");
					break;

			case 2:  System.out.println("memory status");
					
				System.out.println("choose your desired menu in the phonebook");
					phonebook= sc.nextInt();
						break;
				default:
					System.out.println("Enter a value between 1 and 2");
						}

			case 9:
				System.out.println("speed dial");
					break;

			case 10:
				System.out.println("voice tags");
				System.out.println("Choose another number to navigate another menu in your main menu");
				menu= sc.nextInt();
					break;
					}
			case 2:
				System.out.println("message");

			String var2= """
			1:write message
			2:inbox
			3:outbox
			4:picture message
			5:template
			6:smileys
			7:message setting
				""";
			System.out.println(var2);
			System.out.println("Enter a number to choose the menu you want to navagate to in the message menu");
			sms= sc.nextInt();
			

	switch(sms){

	case 1:
		System.out.println("write message");
			break;
	case 2:
		System.out.println("inbox");
			break;
	case 3:
		System.out.println("outbox");
			break;
	case 4:
		System.out.println("picture messages");
			break;
	case 5:
		System.out.println("templates");
			break;
	case 6:
		System.out.println("smielys");
			break;
	case 7:
		System.out.println("message setting");
		String var3= """
		1:set 1 square
		2:common
			""";
		System.out.println(var3);
		System.out.println("Choose one of the message settings menu");
		messageSetting= sc.nextInt();

		switch(square1){
		case 1:
			String var4= """
			1:messaging centre number
			2:messaging sent as
			3:message validaty
				""";
				System.out.println(var4);
				System.out.println("messaging centre number");
					break;
			case 2:
				System.out.println("messaging sent as");
				break;

			case 3:
				System.out.println("message validaty");
				break;
				}
				
		switch(common){

	case 1:
		System.out.println("delivery report");
				break;

	case 2:
		System.out.println("reply via same centre");
				break;
	case 3:
		System.out.println("character support");
		System.out.println("enter another number go back to another menu in the message menu");
			sms= sc.nextInt();
				break;
		
				}
		
			
	case 8:
		System.out.println("info service");
				break;
	case 9:
		System.out.println("voice mailbox number");
				break;

	case 10:
		System.out.println("service command editor");
				break;
				}

	case 3:
		System.out.println("chat");
				break;

	case 4:
		System.out.println("call register");
				
		String var5= """
		1:missed calls
		2:Recived calls
		3:Dialled calls
		4:Erase recent call list
		5:Show call duration
		6:Show call cost
		7:call cost settings
		8:prepaid credit
			""";
		
		System.out.println(var5);
		System.out.println("Choose your desired menu in call register menu");
			callregister= sc.nextInt();

		switch(callregister){

	case 1:
		System.out.println("missed calls");
				break;
	case 2:
		System.out.println("received calls");
				break;
	case 3:
		System.out.println("dialled calls");
				break;
	case 4:
		System.out.println("erase recent call list");
				break;
 	case 5:
		System.out.println("show call duration");
		String var6= """
		1:last call duration
		2:all calls duration
		3:received calls duration
		4:dialled calls duration
		5:clear timer
			""";
		System.out.println(var6);
				
		
				
		switch(callduration){

	case 1:
		System.out.println("last call duration");
				break;
	case 2:
		System.out.println("all calls duration");
				break;
	case 3:
		System.out.println("received calls duration");
				break;
	case 4:
		System.out.println("dialled calls duration");
				break;
	case 5:
		System.out.println("clear timer");
				break;
	default:
		System.out.println("enter a number between 1 and 5");
				break;
		
				}
	case 6:
		System.out.println("show all cost");
		String var7= """
		1:last call cost
		2:all call cost
		3:clear counter
			""";
		System.out.println(var7);
		System.out.println("choose from the show all cost menu");
			cost= sc.nextInt();

		switch(cost){
	
	case 1:
		System.out.println("last call cost");
				break;
	case 2:
		System.out.println("all call cost");
				break;
	case 3:
		System.out.println("clear counter");
				break;
				}
				
	case 7:
		System.out.println("call cost setting");
			String var8= """
			1:call cost limit
			2:show cost in
				""";
			System.out.println("Choose among the menu for call cost settings");
				costsetting= sc.nextInt();
			
			switch(costsetting){
		
		case 1:
			System.out.println("call cost limit");
				break;
		case 2:
			System.out.println("show cost in");
				break;
		default:
			System.out.println("enter numbers between 1 and 2");
				break;
					}

		case 8:
			System.out.println("prepaid credit");
				break;

		case 9:
			System.out.println("tones");
			String var9= """
			1:ringing tone
			2:ringing volume
			3:incoming call alret
			4:composer
			5:messaging alret tone
			6:keypad tones
			7:warning and games tones
			8:vibrating tones
			9:screen saver
				""";
			System.out.println("choose from the tones menu");
				tones= sc.nextInt();
				

			switch(tones){
			
		case 1:
			System.out.println("ringing tones");
				break;
		case 2:
			System.out.println("ringing volume");
				break;
		case 3:
			System.out.println("incoming call alret");
				break;
		case 4:
			System.out.println("composer");
				break;
		case 5:
			System.out.println("messaging alret tone");
				break;
		case 6:
			System.out.println("keypad tones");
				break;
		case 7:
			System.out.println("warning and gaming tones");
				break;
		case 8:
			System.out.println("vibrating alret");
				break;
		case 9:
			System.out.println("screen saver");
				break;
		default:
			System.out.println("enter number in the range of 1 to 9");
				break;
				}
	
		case 10:
		
			System.out.println("settings");
			String var10= """
			1:call settings
			2:phone settings
			3:security settings
			4:restore factory settings
				""";
			System.out.println(var10);
			System.out.println("select from the settings menu");
			setting= sc.nextInt();
			
		switch(setting){
			case 1:

				System.out.println("select from the call setting menu");
				callsetting= sc.nextInt();
			
		
			String vart= """
			1:Automatic redial
			2:Speed dialling
			3:call waiting option
			4:Own number sending
			5:Phone line in use
			6:Automatic answer
				""";
				System.out.println(vart);

					
			switch(callsetting){
		
				

		case 1:
			System.out.println("Automatic redial");
				break;
		case 2:
			System.out.println("Speed dialling");
				break;
		case 3:
			System.out.println("call waiting option");
				break;	
		case 4:
			System.out.println("own number sending");
				break;
		case 5:
			System.out.println("phone line use");
				break;
		case 6:
			System.out.println("automatic answer");
				break;
		default:
			System.out.println("you have entered a wrong input");
				break;
			

		                }

		case 2:
			System.out.println("phone setting");
			String shart= """
			1:language
			2:cell info display
			3:welcome note
			4:network selection
			5:lights square
			6:confirm sim service actions
					""";
			System.out.println(shart);
			System.out.println("select from the phone setting menu");
				phonesetting= sc.nextInt();

		switch(phonesetting){
		
		case 1:
			System.out.println("language");
				break;
		case 2:
			System.out.println("cell info display");
				break;
		case 3:
			System.out.println("welcome note");
				break;
		case 4:
			System.out.println("network selection");
				break;
		case 5:
			System.out.println("light square");
				break;
		case 6:
			System.out.println("confirm sim action");
				break;
		
				}

		case 3:
		
			System.out.println("security settings");
				
	
				String var13 = """
				1:pin code request
				2:call barring service
				3:fixed dialling
				4:closed user group
				5:phone security
				6:change access codes
				""";
	
			System.out.println(var13);
			
			System.out.println("select from  security settings method");
				securitysetting= sc.nextInt();
			
		switch(securitysetting){
		
		case 1:
			System.out.println("pin code request");
				break;
		case 2:
			System.out.println("call barring service");
				break;
		case 3:
			System.out.println("fixed dialling");
				break;
		case 4:
			System.out.println("closed user group");
				break;
		case 5:
			System.out.println("phone security");
				break;
		case 6:
			System.out.println("change access code");
				break;
				}

		case 4:
			
			System.out.println("restore factory settings");
				break;
				}
	
		case 11:
			System.out.println("call divert");
				break;
	
		case 12:
			System.out.println("games");
				break;
		case 13:
			System.out.println("calculator");
				break;
		case 14:
			System.out.println("reminders");
				break;
		case 15:
			System.out.println("clock");
			System.out.println("select a menu from the clock menu");
			 clock= sc.nextInt();
				String job= """
				1:Alarm clock
				2:Clock settings
				3:Date settings
				4:Stopwacth
				5:Countdown
				6:Auto update date and time
						""";

				System.out.println(job);
			
			switch(clock){
		
		case 1:
			System.out.println("alarm clock");
				break;
		case 2:
			System.out.println("clock settings");
				break;
		case 3:
			System.out.println("date settings");
				break;
		case 4:
			System.out.println("stop wacth");
				break;
		case 5:
			System.out.println("count down timer");
				break;
		case 6:
			System.out.println("Auto update of date and time");
				break;
				
				}

	case 16:
			System.out.println("Profiles");
				break;

	case 17:
			System.out.println("Sim services 3");
				break;























		
	



				







			
			
		
					}

}	
		
}

}









		

