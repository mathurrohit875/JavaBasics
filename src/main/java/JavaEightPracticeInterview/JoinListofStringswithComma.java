package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Join a list of strings into a single string with comma separators.
Input:
List<String> words = Arrays.asList("Java", "Python", "C++");
Expected Output:
"Java,Python,C++"

 */
public class JoinListofStringswithComma {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("Java", "Python", "C++");
    String collect = words.stream().collect(Collectors.joining(","));
    System.out.println(collect);
  }
}
