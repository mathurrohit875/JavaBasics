package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetlistofSquaresNoDuplicates {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 3, 2, 4);

    List<Integer> collect = numbers
          .stream()
          .map(n -> n * n)
          .distinct()
          .collect(Collectors.toList());
    System.out.println(collect);

  }
}
