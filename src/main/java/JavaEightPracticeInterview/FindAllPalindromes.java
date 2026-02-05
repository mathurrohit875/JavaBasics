package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of words, return all palindromes.
Input:
List<String> words = Arrays.asList("madam", "car", "racecar", "apple");
Expected Output:
[madam, racecar]

 */
public class FindAllPalindromes {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("madam", "car", "racecar", "apple");
    List<String> collect = words
          .stream()
          .filter(w -> w.contentEquals(new StringBuilder(w).reverse()))
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
