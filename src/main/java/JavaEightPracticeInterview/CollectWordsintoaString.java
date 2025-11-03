package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Concatenate all words in the list into a single string, separated by spaces.
Input:
List<String> words = Arrays.asList("hello", "world", "java");
Expected Output:
"hello world java"

 */
public class CollectWordsintoaString {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hello", "world", "java");
    String collect = words.stream().collect(Collectors.joining(" "));
    System.out.println(collect);

  }
}
