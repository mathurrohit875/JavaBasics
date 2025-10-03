package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
From a list of strings, find the first one with length greater than 4.
Input:
List<String> words = Arrays.asList("cat", "tiger", "bat", "elephant");
Expected Output:
"tiger"

 */
public class FindtheFirstStringwithLengthGreaterThanFour {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "tiger", "bat", "elephant");
    String collect = words.stream().filter(n -> n.length() > 4).findFirst().get();
    System.out.println(collect);
  }
}
