package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;

/*
Problem:
Find the sum of lengths of all words in the list.
Input:
List<String> words = Arrays.asList("cat", "dog", "elephant");
Expected Output:
14

 */
public class FindtheSumofAllLengths {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog", "elephant");
    int sum = words.stream().mapToInt(n -> n.length()).sum();
    System.out.println(sum);


  }
}
