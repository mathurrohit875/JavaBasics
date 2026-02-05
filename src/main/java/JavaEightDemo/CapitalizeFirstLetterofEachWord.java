package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterofEachWord {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");

    List<String> collect =
          words
                .stream()
                .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
                .collect(Collectors.toList());
    System.out.println(collect);
  }
}
