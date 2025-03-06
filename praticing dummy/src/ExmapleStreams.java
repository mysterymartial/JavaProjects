import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExmapleStreams {
    public static void main(String[] args) {
        String fiepath = "specify the path you want it put the file and put it in the new fileoutput sream";

        try(FileOutputStream fos = new FileOutputStream("text.txt", true)){
            // the true argument make the file keeps it formal state when its being changed in the code
            String text = """
                thanks man
                
                """;
            fos.write(text.getBytes());
        }
        catch(IOException exception){
            System.out.println(exception.getMessage());
        }


    }


}
