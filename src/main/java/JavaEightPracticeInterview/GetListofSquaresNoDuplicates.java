package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of integers, return a list of their squares with no duplicates.
Input:
List<Integer> numbers = Arrays.asList(2, 3, 2, 4);
Expected Output:
[4, 9, 16]

 */
public class GetListofSquaresNoDuplicates {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 3, 2, 4);
    List<Integer> collect = numbers.stream().map(n -> n * n).distinct().collect(Collectors.toList());
    System.out.println(collect);
  }
}
