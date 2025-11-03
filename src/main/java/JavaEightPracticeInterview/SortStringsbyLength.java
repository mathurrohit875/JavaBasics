package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Sort a list of strings by their length.
Input:
List<String> words = Arrays.asList("apple", "banana", "cherry", "kiwi");
Expected Output:
[kiwi, apple, banana, cherry]

 */
public class SortStringsbyLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "kiwi");
    List<String> collect = words.stream().sorted((m, n) -> m.length() - n.length()).collect(Collectors.toList());
    System.out.println(collect);
  }
}
