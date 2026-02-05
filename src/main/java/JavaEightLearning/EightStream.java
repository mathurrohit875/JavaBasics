package JavaEightLearning;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EightStream {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int sum = Arrays.stream(array).filter(n -> n % 2 == 0).sum();
    System.out.println(sum);
    String[] arr = {"aaa", "bbb", "ccc"};
    Stream<String> stream = Arrays.stream(arr);
    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    Stream<Integer> iterate = Stream.iterate(10, n -> n + n).limit(10);
    System.out.println(iterate.collect(Collectors.toList()));
    Stream<String> limit = Stream.generate(() -> "hello").limit(10);
    System.out.println(limit.collect(Collectors.toList()));
  }
}
