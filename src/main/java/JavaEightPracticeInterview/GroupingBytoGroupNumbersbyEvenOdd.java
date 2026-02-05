package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Group numbers into even and odd using groupingBy.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
Expected Output:
{false=[1, 3, 5], true=[2, 4, 6]}

 */
public class GroupingBytoGroupNumbersbyEvenOdd {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
    System.out.println(collect);
  }
}
