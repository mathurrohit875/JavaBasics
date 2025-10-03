package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Problem:
From a list of strings, return the shortest one.
Input:
List<String> words = Arrays.asList("elephant", "cat", "dog", "hippo");
Expected Output:
"cat"

 */
public class GettheShortestWord {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("elephant", "cat", "dog", "hippo");
    String s = words.stream().min(Comparator.naturalOrder()).get();
    System.out.println(s);
  }
}
