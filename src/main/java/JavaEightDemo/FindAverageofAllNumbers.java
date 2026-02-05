package JavaEightDemo;

import java.util.Arrays;
import java.util.List;

public class FindAverageofAllNumbers {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(10, 20, 30, 40);
    nums.stream().mapToInt(n -> n).average().ifPresent(System.out::println);

  }
}
