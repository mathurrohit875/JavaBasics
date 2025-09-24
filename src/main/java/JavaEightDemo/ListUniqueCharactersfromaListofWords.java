package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ListUniqueCharactersfromaListofWords {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("caat", "dog", "cerd");
    List<Character> collect = words.stream()
          .flatMap(word -> (word).chars().mapToObj(c -> (char) c))
          .distinct()
          .collect(Collectors.toList());
    System.out.println(collect);

  }
}
