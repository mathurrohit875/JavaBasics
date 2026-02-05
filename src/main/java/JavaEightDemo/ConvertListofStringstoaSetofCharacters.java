package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListofStringstoaSetofCharacters {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog");

    List<Character> collect = words
          .stream()
          .flatMap(w -> w.chars().mapToObj(c -> (char) c))
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
