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
    //using stream
    long count = nums.stream().filter(n -> n % 2 == 0).count();
    System.out.println(count);

    //using for loop
    int c = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        c++;
      }
    }
    System.out.println(c);
  }
}
