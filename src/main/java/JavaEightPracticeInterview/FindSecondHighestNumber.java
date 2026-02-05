package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Problem:
Find the second highest number from a list.
Input:
List<Integer> nums = Arrays.asList(5, 1, 9, 7, 9);
Expected Output:
7

 */
public class FindSecondHighestNumber {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(5, 1, 9, 7, 9);
    Stream<Integer> skip = nums.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1);
    System.out.println(skip.collect(Collectors.toList()));
  }
}
