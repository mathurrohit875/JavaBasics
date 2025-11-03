package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Create a list of strings whose length is less than 5.
Input:
List<String> words = Arrays.asList("cat", "dog", "elephant", "bird", "apple");
Expected Output:
[cat, dog, bird]

 */
public class CreateAListOfStringsWithLengthLessThanFive {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog", "elephant", "bird", "apple");
    List<String> collect = words.stream().filter(n -> n.length() < 5).collect(Collectors.toList());
    System.out.println(collect);
  }
}
