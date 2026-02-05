package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Count how many words have a length greater than 3.
Input:
List<String> words = Arrays.asList("cat", "elephant", "dog", "apple");
Expected Output:
3

 */
public class CountWordswithLengthGreaterThanThree {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "elephant", "dog", "apple");
    long count = words.stream().filter(n -> n.length() > 3).count();
    System.out.println(count);
  }
}
