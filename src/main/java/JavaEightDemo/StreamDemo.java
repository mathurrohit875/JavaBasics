package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    System.out.println(list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
    List<Integer> lists = Arrays.asList(1, 2, 3, 4);
    Stream<Integer> stream = list.stream();
    String[] str = {"dwd", "dwed", "eded"};
    Stream<String> stringStream = Arrays.stream(str);
    Stream<String> stream2 = Stream.of("sxs", "Xs");

    Stream<Integer> generate = Stream.generate(() -> 1).limit(100);

    Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
  }
}
