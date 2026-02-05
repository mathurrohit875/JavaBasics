package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Find the longest word from a list.
Input:
List<String> words = Arrays.asList("dog", "elephant", "cat", "giraffe");
Expected Output:
"elephant"

 */
public class FindTheLongestWord {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("dog", "elephant", "cat", "giraffe");
    String s = words
          .stream()
          .sorted((m, n) -> n.length() - m.length())
          .findFirst()
          .get();
    System.out.println(s);
  }
}
