package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Group strings by their first character.
Input:
List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");
Expected Output:
{
  a=[apple, avocado],
  b=[banana, blueberry],
  c=[cherry]
}

 */
public class GroupStringsbyFirstCharacter {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");

    Map<Character, List<String>> collect = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
    System.out.println(collect);


  }
}
