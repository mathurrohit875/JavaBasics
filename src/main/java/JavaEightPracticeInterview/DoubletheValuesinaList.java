package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of integers, use Stream and Lambda to double each value.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
Expected Output:
[2, 4, 6, 8]

 */
public class DoubletheValuesinaList {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> list = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
    System.out.println(list);

  }
}
