import java.util.Scanner;
public class Moneyconvert{
       public static void main(String[]args){

      
       float rate;
       float dollar;
       float chinayen;
       float exchanged;
       float exchangec;
       Scanner sc=  new Scanner(System.in);
       System.out.println("choose zero to do exchange in dollar and choose one to exchange in chinayen");

       int value= 2;
       System.out.println("select either 0 or 1");
       value= sc.nextInt(); 
       
       switch(value)
           {

       case 0:
      
                            System.out.println("ENTER YOUR exchange rate");
                         rate= sc.nextFloat();
       
                      System.out.println("ENTER YOUR AMOUNT IN DOLLAR");
                    dollar= sc.nextFloat();
                         exchanged= dollar*rate;
                  System.out.println("YOUR DOLLAR IN CHINAYEN IS " + exchanged);
        
                  break;
      
       case 1: 
       
                    System.out.println("ENTER YOUR EXCHANGE RATE");
                   rate= sc.nextFloat();
                      System.out.println("ENTER YOUR AMOUNT IN CHINAYEN");
                                  chinayen= sc.nextFloat();
       
                                 exchangec= chinayen/rate;
                   System.out.println("CHINAYEN IN DOLLAR IS " + exchangec);
                             break;

       default:
                      System.out.println("YOU DID NOT ENTER A NUMBER BETWEEN 0 AND 1");
       
      
       
       

         }
       
        
       
       
            }
            }