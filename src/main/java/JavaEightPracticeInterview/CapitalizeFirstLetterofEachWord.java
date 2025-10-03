package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of lowercase words, capitalize the first letter of each.
Input:
List<String> words = Arrays.asList("apple", "banana", "cherry");
Expected Output:
[Apple, Banana, Cherry]

 */
public class CapitalizeFirstLetterofEachWord {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    List<String> collect = words.stream().map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.toList());
    System.out.println(collect);


  }
}
