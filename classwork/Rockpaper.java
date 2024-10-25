   import java.util.Random;
import java.util.Scanner;
public class Rockpaper{
        public static void main(String[]args){
        System.out.println("WELCOME TO THE GAME OF ROCK PAPER SCICCIORS");
         Scanner sc= new Scanner(System.in);
         Random obj= new Random();
         
         int computer;
         int gamer;
         computer= obj.nextInt(2-0) + 0;

         System.out.println("ENTER ANY NUMBER BETWEEN 0,1,AND 2");
         gamer= sc.nextInt();

         switch(computer){

         case 0:
             if (computer ==0 && gamer==1){
                 System.out.println("the computer is scissor and you are rock, you won");
             }
          
          else if (computer ==0 && gamer==2){
             
                System.out.println("the computer is scissor, you are paper you lose");
                  }
           
     
          else if (computer==0 && gamer==0){
               System.out.println("the computer is scissor, you are scissor , its a draw");
               }
         
        case 1:
                  if (computer ==1 && gamer==0){
                 System.out.println("the computer is rock and you are scissor, you lose");
             }
          
          else if (computer ==1 && gamer==2){
             
                System.out.println("the computer is rock, you are paper you won");
                  }
           
     
          else if (computer==1 && gamer==1){
               System.out.println("the computer is rock, you are rock, its a draw");
               }


  case 2:
           if (computer ==2 && gamer==0){
                 System.out.println("the computer is paper and you are scissor, you won");
             }
          
          else if (computer ==2 && gamer==1){
             
                System.out.println("the computer is paper, you are rock you lose");
                  }
           
     
          else if (computer==2 && gamer==2){
               System.out.println("the computer is paper, you are paper, its a draw");
               }
         

         

               
     		



	default:
             		System.out.println("you have input a wrong number");
               
                }
         


         
      
    
        
  
         }
         } 