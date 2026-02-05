package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Group a list of strings by their lengths.
Input:
List<String> words = Arrays.asList("hi", "hello", "hey", "world");
Expected Output:
{
  2=[hi],
  3=[hey],
  5=[hello, world]
}

 */
public class GroupStringsbyLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hey", "world");
    Map<Integer, List<String>> collect = words
          .stream()
          .collect(Collectors.groupingBy(String::length));
    System.out.println(collect);
  }
}
