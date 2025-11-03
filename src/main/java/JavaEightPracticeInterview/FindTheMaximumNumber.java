package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Problem:
Find the maximum number from a list of integers using Stream.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Expected Output:
5

 */
public class FindTheMaximumNumber {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Integer integer = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    System.out.println(integer);
    Integer integer1 = numbers.stream().max(Comparator.naturalOrder()).get();
    System.out.println(integer1);
  }
}
