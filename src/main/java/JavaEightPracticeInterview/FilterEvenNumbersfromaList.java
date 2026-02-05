package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of integers, use a Stream and Lambda to filter only even numbers.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
Expected Output:
[2, 4, 6]

 */
public class FilterEvenNumbersfromaList {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> list = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println(list);
  }
}
