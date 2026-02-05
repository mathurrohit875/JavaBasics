package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Problem:
Find the maximum number using Stream.
Input:
List<Integer> numbers = Arrays.asList(4, 9, 2, 7, 5);
Expected Output:
9

 */
public class FindMaximumNumberinaList {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(4, 9, 2, 7, 5);
    Integer integer = numbers.stream().sorted().max(Comparator.naturalOrder()).get();
    System.out.println(integer);

  }

}
