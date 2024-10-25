package game;

public class StarGame {
    public  static String [] []starArray(int [][] myarray){
        String [][] resultArray = new String[3][3];
        if(myarray.length > 3 || myarray.length < 3){
            throw new IllegalArgumentException("invalid array size");
        }
        for(int count=0; count < myarray.length; count++){
            for(int counter =0; counter < myarray[count].length;counter++){
                if(myarray[count][counter]== 0){
                    resultArray[count][counter] = " ";
                }
                else{
                    resultArray[count][counter] = "*";

                   }

                }







            }




        return resultArray;
    }

}
