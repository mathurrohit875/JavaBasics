package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Find the smallest number that is greater than 5 in the list.
Input:
List<Integer> numbers = Arrays.asList(3, 7, 9, 2, 8, 5);
Expected Output:
7

 */
public class FindTheSmallestNumberGreaterThanFive {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 7, 9, 2, 8, 5);
    Integer integer = numbers.stream().filter(n -> n > 5).min(Integer::compare).get();
    System.out.println(integer);

  }
}
