package JavaEightDemo;

import java.util.Arrays;
import java.util.List;


public class SumLengthsofAllStrings {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("a", "ab", "abc");
    int sum = words.stream().mapToInt(String::length).sum();
    System.out.println(sum);


  }
}
