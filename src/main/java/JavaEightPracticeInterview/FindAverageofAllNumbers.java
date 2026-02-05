package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
Problem:
Find the average of a list of integers.
Input:
List<Integer> nums = Arrays.asList(10, 20, 30, 40);
Expected Output:
25.0

 */
public class FindAverageofAllNumbers {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(10, 20, 30, 40);


    OptionalDouble average = nums.stream().mapToInt(n -> n).average();
    // System.out.println(average);
    if (average.isPresent()) {
      System.out.println(average.getAsDouble());
    } else {
      System.out.println("no");
    }
  }
}
