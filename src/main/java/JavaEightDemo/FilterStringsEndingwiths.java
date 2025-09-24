package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsEndingwiths {

  public static void main(String[] args) {
    List<String> items = Arrays.asList("apples", "banana", "oranges", "grape");
    List<String> str = items.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
    str.forEach(System.out::println);
  }
}
