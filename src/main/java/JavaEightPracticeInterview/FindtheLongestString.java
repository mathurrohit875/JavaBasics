package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Problem:
Find the longest string from a list.
Input:
List<String> words = Arrays.asList("car", "elephant", "train", "plane");
Expected Output:
"elephant"

 */
public class FindtheLongestString {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("car", "elephant", "train", "plane");
    String s = words.stream().max(Comparator.comparing(String::length)).get();
    System.out.println(s);
  }
}
