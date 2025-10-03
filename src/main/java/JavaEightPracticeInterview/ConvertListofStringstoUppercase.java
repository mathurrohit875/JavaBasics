package JavaEightPracticeInterview;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Convert all strings in a list to uppercase using Stream and Lambda.
Input:
List<String> words = Arrays.asList("apple", "banana", "cherry");
Expected Output:
[APPLE, BANANA, CHERRY]

 */
public class ConvertListofStringstoUppercase {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    List<String> stringList = words.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(stringList);
  }
}
