package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Filter numbers divisible by 3 from a list.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
Expected Output:
[3, 6, 9]

 */
public class FilterNumbersDivisiblebyThree {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
    List<Integer> collect = numbers.stream().filter(n -> n % 3 == 0).collect(Collectors.toList());
    System.out.println(collect);
  }
}
