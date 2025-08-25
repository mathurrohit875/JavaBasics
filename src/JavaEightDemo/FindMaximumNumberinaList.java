package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumNumberinaList {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(4, 9, 2, 7, 5);

    numbers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);


  }
}
