package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {
  /*
  Problem:
  Calculate the sum of squares of a list of integers.
  Input:
  List<Integer> nums = Arrays.asList(1, 2, 3, 4);
  Expected Output:
  30 // (1*1 + 2*2 + 3*3 + 4*4)

   */
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    int sum1 = nums.stream().mapToInt(n -> n * n).sum();
    System.out.println(sum1);


  }
}
