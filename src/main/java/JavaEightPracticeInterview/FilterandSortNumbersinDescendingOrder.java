package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Filter numbers greater than 5 and sort them in descending order.
Input:
List<Integer> nums = Arrays.asList(3, 7, 2, 10, 6);
Expected Output:
[10, 7, 6]

 */
public class FilterandSortNumbersinDescendingOrder {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(3, 7, 2, 10, 6);
    List<Integer> collect = nums
          .stream()
          .filter(n -> n > 5)
          .sorted(Comparator.reverseOrder())
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
