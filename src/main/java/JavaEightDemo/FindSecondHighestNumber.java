package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(5, 1, 9, 7, 9);

    nums
          .stream()
          .distinct()
          .sorted(Comparator.reverseOrder())
          .skip(1)
          .findFirst()
          .ifPresent(System.out::println);


  }
}
