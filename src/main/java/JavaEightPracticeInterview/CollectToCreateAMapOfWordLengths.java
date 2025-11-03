package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Create a map of words and their lengths from a list of strings.
Input:
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
Expected Output:
{apple=5, banana=6, cherry=6, date=4}

 */
public class CollectToCreateAMapOfWordLengths {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
    Map<String, Integer> collect = words.stream().collect(Collectors.toMap(m -> m, String::length));
    System.out.println(collect);
  }
}
