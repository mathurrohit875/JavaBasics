package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GettheShortestWord {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("elephant", "cat", "dog", "hippo");

    words
          .stream()
          .min(Comparator.comparing(String::length))
          .ifPresent(word -> System.out.println(word + " " + word.length()));


  }
}
