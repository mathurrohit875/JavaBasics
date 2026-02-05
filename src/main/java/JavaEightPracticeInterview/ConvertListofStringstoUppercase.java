package JavaEightPracticeInterview;


import java.util.ArrayList;
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
    //using stream
    List<String> collect = words.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
    System.out.println(collect);

    //using for loop
    List<String> cc = new ArrayList<>();
    for (String s : words) {
      cc.add(s.toUpperCase());
    }
    System.out.println(cc);

  }
}
