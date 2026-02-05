package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Find all words containing the letter "a" from a list.
Input:
List<String> words = Arrays.asList("cat", "dog", "banana", "apple", "orange");
Expected Output:
[cat, banana, apple, orange]

 */
public class FindWordsContainingaSpecificCharacter {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog", "banana", "apple", "orange");
    List<String> a = words.stream().filter(n -> n.contains("a")).collect(Collectors.toList());
    System.out.println(a);

  }
}
