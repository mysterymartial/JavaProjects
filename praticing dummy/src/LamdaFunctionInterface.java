import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LamdaFunctionInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number)->{
            System.out.println(number);

        };
        consumer.accept(100);

        BiConsumer<Integer, Integer> biConsumer = (number, number2)->{
            System.out.println(number + number2);
        };
        biConsumer.accept(100,100);



    }


}
