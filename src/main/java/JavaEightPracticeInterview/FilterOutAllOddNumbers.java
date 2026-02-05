package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Filter out all odd numbers from a list.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
Expected Output:
[2, 4, 6]

 */
public class FilterOutAllOddNumbers {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println(collect);
  }
}
