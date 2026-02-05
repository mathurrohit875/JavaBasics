package JavaEightLearning;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class BiPredBiFuncBiCon {

  public static void main(String[] args) {
    BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
    System.out.println(biPredicate.test(2, 4));

    BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
    System.out.println(biFunction.apply("hello", "bye"));

    BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
    biConsumer.accept(2, 2);

    Supplier<Integer> supplier = () -> 1;
    System.out.println(supplier.get());

  }
}
