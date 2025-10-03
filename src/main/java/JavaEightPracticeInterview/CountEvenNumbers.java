package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Count how many even numbers are in a list.
Input:
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
Expected Output:
3

 */
public class CountEvenNumbers {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
    long count = nums.stream().filter(n -> n % 2 == 0).count();
    System.out.println(count);
  }
}
