package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Sort a list of integers in ascending order.
Input:
List<Integer> numbers = Arrays.asList(5, 1, 9, 7, 3);
Expected Output:
[1, 3, 5, 7, 9]

 */
public class SortNumbersInAscendingOrder {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 1, 9, 7, 3);
    List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
    System.out.println(collect);

  }
}
