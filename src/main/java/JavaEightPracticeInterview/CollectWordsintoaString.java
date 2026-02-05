package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Concatenate all words in the list into a single string, separated by spaces.
Input:
List<String> words = Arrays.asList("hello", "world", "java");
Expected Output:
"hello world java"

 */
public class CollectWordsintoaString {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hello", "world", "java");

    //Using Stream
    String collect = words.stream().collect(Collectors.joining(" "));
    System.out.println(collect);

    //Using forloop
    String comb = "";
    for (int i = 0; i < words.size(); i++) {
      comb += words.get(i) + " ";
    }
    System.out.println(comb);

  }
}
