package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Find all words with a length greater than 3 from a list.
Input:
List<String> words = Arrays.asList("cat", "elephant", "dog", "apple", "kiwi");
Expected Output:
[elephant, apple]

 */
public class FindAllWordswithLengthGreaterThanThree {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "elephant", "dog", "apple", "kiwi");
    List<String> collect = words.stream().filter(m -> m.length() > 3).collect(Collectors.toList());
    System.out.println(collect);
  }
}
