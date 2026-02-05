package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Problem:
Find the word with the maximum length from a list.
Input:
List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");
Expected Output:
"elephant

 */
public class FindtheWordwiththeMaximumLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");
    String s = words.stream().max(Comparator.comparing(String::length)).get();
    System.out.println(s);
  }
}
