package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesfromList {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
    List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
    System.out.println(collect);

  }
}
