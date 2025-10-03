package JavaEightLearning;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator {

  public static void main(String[] args) {
    Function<Integer, Integer> function1 = n -> n + n;
    Function<String, String> function2 = str -> str.toLowerCase();
    UnaryOperator<Integer> unaryOperator = x -> x * x;
    System.out.println(unaryOperator.apply(5));
    UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
    System.out.println(unaryOperator1.apply("hello"));
    BinaryOperator<String> binaryOperator = (str, str2) -> str + " " + str2;
    System.out.println(binaryOperator.apply("hello", "world"));

  }
}
