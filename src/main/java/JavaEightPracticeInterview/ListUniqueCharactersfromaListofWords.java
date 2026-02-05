package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of words, extract all unique characters.
Input:
List<String> words = Arrays.asList("cat", "dog");
Expected Output:
[c, a, t, d, o, g]

 */
public class ListUniqueCharactersfromaListofWords {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog");
    List<Character> collect = words
          .stream()
          .flatMap(word -> word.chars().mapToObj(c -> (char) c))
          .distinct()
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
