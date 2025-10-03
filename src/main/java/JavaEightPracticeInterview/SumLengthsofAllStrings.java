package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Find the sum of lengths of all strings in a list.
Input:
List<String> words = Arrays.asList("a", "ab", "abc");
Expected Output:
6

 */
public class SumLengthsofAllStrings {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("a", "ab", "abc");
    int sum = words.stream().mapToInt(n -> n.length()).sum();
    System.out.println(sum);
  }
}
