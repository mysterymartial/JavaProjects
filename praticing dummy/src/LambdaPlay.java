import java.util.stream.IntStream;

public class LambdaPlay {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,30)
                .filter(n -> n % 3 == 0)
                .sum();
        System.out.println(sum);

    }


}
