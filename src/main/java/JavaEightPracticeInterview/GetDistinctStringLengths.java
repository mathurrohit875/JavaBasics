package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of strings, return a list of distinct lengths.
Input:
List<String> words = Arrays.asList("hi", "hello", "bye", "hi", "world");
Expected Output:
[2, 5, 3]

 */
public class GetDistinctStringLengths {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "bye", "hi", "world");
    List<Integer> collect = words.stream().map(String::length).distinct().collect(Collectors.toList());
    System.out.println(collect);
  }
}
