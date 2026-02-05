package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Use distinct() to remove duplicates from a list.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 1);
Expected Output:
[1, 2, 3, 4, 5]

 */
public class DistinctToRemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 1);
    List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
    System.out.println(collect);

  }
}
