package JavaEightLearning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

  public static void main(String[] args) {
    String str = "hello";
    Consumer<String> consumer = System.out::println;
    consumer.accept("hello");

    Consumer<List<Integer>> list = li -> {
      for (Integer i : li) {
        System.out.println(i + 10);
      }
    };
    // list.accept(Arrays.asList(1,2,3,4,5));

    Consumer<List<Integer>> consumer1 = s -> {
      for (Integer i : s) {
        System.out.println(i);
      }
    };
    consumer1.andThen(list).accept(Arrays.asList(1, 2, 3, 4, 5));

    String st = "aa";
    Consumer<String> consumer2 = s -> System.out.println(s);
    consumer2.accept(st);
  }
}
