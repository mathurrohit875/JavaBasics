package JavaEightPracticeInterview;


import java.util.Arrays;
import java.util.List;

/*
Problem:
Count how many strings in a list have length greater than 3.
Input:
List<String> words = Arrays.asList("cat", "lion", "tiger", "dog");
Expected Output:
2

 */
public class CountStringswithLengthGreaterThanThree {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "lion", "tiger", "dog");
    long count = words.stream().filter(n -> n.length() > 3).count();
    System.out.println(count);
  }

}
