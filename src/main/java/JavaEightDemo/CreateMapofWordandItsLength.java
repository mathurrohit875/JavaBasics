package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMapofWordandItsLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "horse", "dog");
    Map<String, Integer> collect = words.stream().collect(Collectors.toMap(w -> w, w -> w.length()));
    System.out.println(collect);
    for (Map.Entry<String, Integer> m : collect.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());

    }


  }
}
