package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Use reduce() to find the sum of all integers in a list.
Input:
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
Expected Output:
100

 */
public class ReduceToFindSumofAllNumbers {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
    Integer reduce = numbers.stream().reduce(0, Integer::sum);
    System.out.println(reduce);
  }
}
