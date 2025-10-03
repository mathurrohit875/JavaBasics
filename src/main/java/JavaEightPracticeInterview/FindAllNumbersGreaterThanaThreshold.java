package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Return all numbers greater than 10 from a list.
Input:
List<Integer> numbers = Arrays.asList(5, 12, 3, 18, 7);
Expected Output:
[12, 18]

 */
public class FindAllNumbersGreaterThanaThreshold {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 12, 3, 18, 7);
    List<Integer> collect = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
    System.out.println(collect);

  }


}
