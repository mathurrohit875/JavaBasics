package JavaEightPracticeInterview;

import java.util.ArrayList;
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
    //Using Stream
    List<String> collect = words.stream().map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.toList());
    System.out.println(collect);
    //Using Traditional For loop
    for (int i = 0; i < words.size(); i++) {
      String s = words.get(i);
      System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    }
    List<String> li = new ArrayList<>();
    //Using String builder
    for (int i = 0; i < words.size(); i++) {
      String s = words.get(i);
      StringBuilder sb = new StringBuilder(s);
      String upperCase = sb.substring(0, 1).toUpperCase() + sb.substring(1);
      System.out.println(upperCase);
      li.add(upperCase);
      words.set(i, sb.substring(0, 1).toUpperCase() + sb.substring(1));
    }
    System.out.println(li);
    System.out.println(words);
  }

}
