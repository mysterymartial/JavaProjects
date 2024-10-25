public class Starshape{
	public static void mymethod(int output){

	

	int line;
	int form;

		for(line=output; line>=1; line--){
		

			

		for(form=line; form<line; form++){

			System.out.print(" ");

			}


		for(form=0; form<=output-line; form++){

			System.out.print("*");

			}

	 			System.out.println();

				}

				}


							
							


			public static void mypattern(int o){

					int horizon, mile;


				for(horizon=o; horizon>=1; horizon--){

				for(mile=1; mile<=horizon; mile++){

				System.out.println("*");

					}

					System.out.println();

				}
				
					}

					public static void main(String[]args){
						

			



						int output= 6;
						mymethod(output);
							



						int o= 6;
				
						mypattern(o);

							}	
							}
			



	
		