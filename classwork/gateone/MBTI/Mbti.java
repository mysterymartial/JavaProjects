public class Mbti{

	public String [] questions(){

		String [] questions = {"1: (A) expand energy, enjoy groups : (B)conserve energy,enjoy one on one", "2: (A) interpret Literally : (B) Look for meaning and possibilites", "3: (A) logical, thinking, questioning : (B) empathetic, feeling, accomodating", "4: (A) organized,orderly : (B) flexible, adaptable", "5: (A) more outgoing,think out loud : (B) more reserved, think to yourself", "6: pratical, realistic, experiential : (B) imaginative, innovative, theoretical", "7: (A) candid, straight forward, frank : (B) tactful, kind, encouraging", "8: (A) plan, schedule : (B) unplanned, spontaneous", "9: (A) seek many tasks, public activities, interaction with others : (B) seek private, solitary activities with queit to concentrate", "10: (A) standard, usaual,conventional : (B) different, novel, unique", "11: (A) firm, tend to criticize, hold the line : (B) gentle, tend to appereciate, conciliate", "12: regulated, structured : (B) easygoing, live and let live", "13: (A) external, communicative, express yourself : (B) internal, reticent, keep to yourself", "14: (A) focus on here-and-now :(B) look to the future, global perspective,(big picture)", "15: (A) tough-minded,just : (B) tendered-hearred,merciful", "16: (A) preparation, plan aheaed : (B) go with the flow, adapt as you go", "17: (A) active, initiate : (B) reflective, delibrate", "18: (A) facts,things, (what is) : (B) ideas, dreams,(what could be, philosophical)", "19: (A) matter of fact, issue-oriented : (B) sensitive, people-oriented,compassionate", "20: (A) control, govern : (B) latitude, freedom"};

	return questions;

}

	public String [] reponses(String reponse){
		String [] reponses = new String[reponse.length()];

		return reponses;

}

	
		

	
		public String getFirstResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[0];
		String second = reponses[4];
		String third = reponses[8];
		String fourth = reponses[12];
		String fifth = reponses[16];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "E";

		

		}else{
			return "I";

}

}



	public String getSecondResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[1];
		String second = reponses[5];
		String third = reponses[9];
		String fourth = reponses[13];
		String fifth = reponses[17];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "S";

		

		}else{
			return "N";
		

	
			

}

}

	
	public String getThirdResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[2];
		String second = reponses[6];
		String third = reponses[10];
		String fourth = reponses[14];
		String fifth = reponses[18];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "T";

		

		}else{
			return "F";
		

	
			

}

}




	public String getFourthResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[3];
		String second = reponses[7];
		String third = reponses[11];
		String fourth = reponses[15];
		String fifth = reponses[19];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "J";

		

		}else{
			return "P";
		

	
			

}

}

	public String getPersonality(String first, String second, String third, String fourth){
		
		String personality = first.concat(second).concat(third).concat(fourth);
		if(personality.equals("ISTJ")) {

			return "The Inspector (ISTJ Personality)ISTJs are serious, proper, and formal in appearance which can be intimidating. They are cultured and have an affection towards tradition. In contrast, they are quiet and usually calm.  They are called inspectors because of their keen attention to detail. ISTJ are rule followers who always take the logical approach towards their goals and projects. Their dominant cognitive function is introverted sensing which helps them take in the details about their environment while their auxiliary cognitive function is extraverted thinking which makes them efficient and logical thinkers. In their relationships, they are very loyal to their friends and family members. Usually, they have a small circle with who they prefer spending their time with. The ISTJ thrives in jobs that require structure, logic, and stability.";
}

	else if(personality.equals("INFJ")){

		return"The Counselor (INFJ Personality)INFJs are visionaries who have a different view of the world. They love introspection and refuse totake things at a surface level. They could be termed weird by others because of how they see life. The INFJ are idealists who love understanding complex issues. They are reserved leaders who are usually creatives due to how easily they get inspired.Also known as the diplomats, the INFJ prefers to cooperate with members of their team as opposed to conflict.The dominant cognitive function of an INFJ is introverted intuition which helps them focus on internal insights and generally influences their decision-making. Their tertiary cognitive function is an extraverted feeling which makes them highly sensitive to the feeling of others or what others refer to as being empathetic. The INFJ thrives in jobs that require a deal of compassion, psychology, and/or collaboration.";

}

	else if(personality.equals("INTJ")){
		
		return"The Mastermind (INTJ Personality)INTJs are introverts who are comfortable being by themselves. They would avoid socializing as it drains their energy. They excel at developing plans and strategies. As analytical problem solvers, this personality type is strategic and innovative Their dominant cognitive function is Introverted intuition which they use to read between the lines and unravel patterns. The auxiliary function is extraverted thinking which makes them deliberate about solutions and highly organized. Also known as the architects, the INTJ thrives in jobs that require logical systems and innovative solutions. They usually prefer to work alone. In relationships, they are loyal and are great at encouraging their partners.";

}


	else if(personality.equals("ENFJ")){
		return"The Giver (ENFJ)ENFJs are individuals who are people-centered. They rely mostly on their intuition and feelings and tend to live through their imagination. They focus on abstracts and what could happen in the future. They are highly empathetic not just to their close friends and family but to people in general. The ENFJ generally loves feedback and they can be referred to as people pleasers. Their dominant cognitive function is an extraverted feeling that helps them be in tune with other people’s feelings. Their auxiliary functions are introverted intuition that makes them focus on the future as opposed to the present moment.They thrive in jobs where they can encourage others and push them to grow. This also includes humanitarian-focused jobs. In relationships, they are supportive and always willing to understand their partners";

}

	else if(personality.equals("ISTP")){
		return "The Craftsman (ISTP)ISTPs are a mysterious, rational, and highly logical bunch. They are spontaneous and unpredictable most times albeit oblivious to those around them because they are experts at hiding their true nature.Their dominant cognitive function is introverted thinking which makes them focus on the logical aspect of a situation. The ISTP’s auxiliary cognitive function is extraverted sensing which helps them focus on abstract things. They thrive in jobs that require technical expertise and physical activity. In relationships, they are calm lovers who prefer being handy around the house.";

}

	else if(personality.equals("ESFJ")) {
		return "The Provider (ESFJ)ESFJs are stereotypically known to be extroverts.They are cheerleaders and raise the spirits of those around them earning them popularity. Because of their nature, they are easily liked and people easily warm up to them.Their dominant cognitive function is an extroverted feeling which makes them work and make decisions based on their gut feeling. The ESFJ’s auxiliary cognitive function is introverted sensing which helps them focus on the present instead of the future or other abstract details.They thrive in jobs that require processes and interpersonal skills. In relationships, they are the traditional partners who believe in structure and stability.";
}


	else if(personality.equals("INFP")){
		return "The Idealist (INFP)INFPs are usually reserved and introverted.They usually spend time all by themselves in quiet places. They love analyzing signs and symbols and using them to draw inferences in explaining what is happening around them.Their dominant cognitive function is an introverted feeling which helps them with processing emotions internally. The INFP auxiliary cognitive function is the extraverted intuition that helps them focus on the big picture through imagination.They thrive in jobs that require visions and align with their goals/ interests. In relationships take time to select their friends and they are quite big on comprise.";

}

	else if(personality.equals("ESFP")){
		return "The Performer (ESFP)ESFPs are mostly perceived to be entertainers. They enjoy being in the spotlight. They enjoy exploring and learning to share what they’ve learned with others through their strong interpersonal skills.Their dominant cognitive function is extraverted sensing which helps them stick to facts instead of abstract ideas. The ESFP’s auxiliary cognitive function is an introverted feeling which helps them make decisions.They thrive in work environments where they can be spontaneous, move around often, and involves the use of artistic values. In relationships, the ESFP will prioritize their family and loved ones over anything although they can also strongly dislike a structured life.";

}

	else if(personality.equals("ENFP")) {
		return "The Champion (ENFP)ENFPs are highly individualistic and refuse to live their lives inside a box. They strive to create their own methods of doing things. They operate with their feelings and are highly perceptive and thoughtfulTheir dominant cognitive function is extraverted intuition which allows them to focus on abstract thoughts and patterns. The auxiliary cognitive function is introverted feelings which make them focus on their feelings rather than logic.In relationships, the ENFP is always expressive and shares affection openly. They also thrive in jobs that demand creativity and imaginative solutions.";
}

	else if(personality.equals("ESTP")) {
		return "The Doer (ESTP)ESTPs are governed by the need to interact with others. They are interested in abstracts and theories. They are spontaneous and risk-taking. They aren’t afraid of making mistakes as they make them up as they go along.Their dominant cognitive function is extraverted sensing which makes them action-oriented. The auxiliary cognitive function of an ESTP is introverted thinking which makes them highly disciplined and very observant.They thrive in career paths that require mechanical skills, flexibility, and one that is quite unpredictable. In relationships, they can be quite adventurous and prefer activities with their loved ones.";
}

	else if(personality.equals("ESTJ")){
		return "The Supervisor (ESTJ)ESTJs are organized and governed by the zeal to do what is right and socially acceptable. They epitomize the ideal individual who is on the track toward doing what is “good” and “right”. They are happy to be of help.Their dominant cognitive function is extraverted thinking which makes them quite practical when compared to other personality types. The auxiliary cognitive functions are introverted sensing which makes them very keen on details and stability.The ESTJs like to work in management positions where they can oversee operations and put in structures. In relationships, they love routines and their loved ones know that they can always be depended on for anything.";

}

	else if(personality.equals("ENTJ")){
		return "The Commander (ENTJ) ENTJs focus on dealing with all things rationally and logically. They are naturally born leaders who command respect. They also do enjoy being in charge. They see obstacles as challenges in which they can prove themselves.Their dominant cognitive function is extraverted thinking which makes them deliberate about orders and judgments. The auxiliary function is introverted intuition which makes them trust their instincts during decision making.The ENTJ thrives in jobs that are complex and require clear strategies for goals. In relationships, they can set high expectations for their loved ones and can be sometimes domineering.";
}

	else if(personality.equals("INTP")){
		return "The Thinker (INTP) INTPs are typically known for their brilliant ideas and propositions.They see a pattern in everything and can easily pick out something that’s out of place. They are concerned with finding an environment where their creative genius can be harnessed.Their dominant cognitive function is introverted thinking which makes them highly understanding and deep thinkers. The auxiliary functions are extraverted intuition which helps with their imagination and inspiration.The INTP thrives in work environments that aren’t focused on traditions. They prefer flexible and independent work styles. In relationships, they are highly unconventional and autonomous.";
}

	else if(personality.equals("ISFJ")) {
		return "The Nurturer (ISFJ) ISFJs are highly generous and ever-ready to give back to society. They are warm and kind-hearted individuals. They possess an awareness and consideration towards bringing out the best in others.The dominant cognitive function is introverted sensing which makes them very detail-oriented. Their auxiliary functions are extraverted feelings which makes them nurturing and very considerateThey thrive in jobs that require structure and are positioned behind the scenes. In relationships, the ISFJ will take care of their loved ones unconditionally.";

}

	else if(personality.equals("ENTP")) {
		return "The Visionary (ENTP)ENTPs are extroverts who do not enjoy small talk.These personalities are very rare to come across. They have a logical and rational approach to discussions and/or arguments. They are knowledgeable but need constant stimulation.Their dominant cognitive function is extroverted intuition which makes them always open to exploring new ideas. The auxiliary function is introverted thinking which makes them quite logical.They thrive in jobs where creativity meets challenges. In relationships, the ENTP is spontaneous and can be quite exciting.";

}

	else if(personality.equals("ISFP")) {
		return "The Composer (ISFP)ISFPs on the outside seem like introverts but deep down they’re warm and very friendly. They are spontaneous and fun to be with. They are always out to explore new things and discover new experiences.Their dominant cognitive function is an introverted feeling which makes them caring. The auxiliary functions are extraverted sensing which makes them appreciate works of art. ISPs prefer to work independently away from the spotlight. In relationships,  they are accommodating and very easygoing";

}

	else{

		return" you must have enterd a wrong answer";
							
							
}
}
}