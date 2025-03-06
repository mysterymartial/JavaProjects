import java.util.Locale;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BipredicateImpl {
    public static void main(String[] args) {
        BiPredicate <Integer,Integer> biPredicate = (number1, number2) -> number1 > number2;
        System.out.println(biPredicate.test(2,2));

        Function <String, Integer> stringConcat = (letter1)-> letter1.length();
        System.out.println(stringConcat.apply("hello"));

        UnaryOperator<String> operator = (letter)-> letter.toUpperCase();
        System.out.println(operator.apply("hello"));

        BinaryOperator<String> operator2 = (letter1, letter2) -> {
            return letter1.concat(letter2);
        };
        System.out.println(operator2.apply("bad","boy"));
    }
}
