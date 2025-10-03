package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of strings, return those ending with the letter "s".
Input:
List<String> items = Arrays.asList("apples", "banana", "oranges", "grape");
Expected Output:
[apples, oranges]

 */
public class FilterStringsEndingwiths {

  public static void main(String[] args) {
    List<String> items = Arrays.asList("apples", "banana", "oranges", "grape");
    List<String> s = items.stream().filter(n -> n.endsWith("s")).collect(Collectors.toList());
    System.out.println(s);
  }
}
