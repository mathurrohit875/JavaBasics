package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Return the first 3 even numbers from a list.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
Expected Output:
[2, 4, 6]

 */
public class FindtheFirstThreeEvenNumbers {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).limit(3).collect(Collectors.toList());
    System.out.println(collect);
  }
}
