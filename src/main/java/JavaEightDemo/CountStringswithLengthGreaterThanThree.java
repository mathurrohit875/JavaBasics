package JavaEightDemo;

import java.util.Arrays;
import java.util.List;

public class CountStringswithLengthGreaterThanThree {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "lion", "tiger", "dog");
    long collect = words.stream().filter(n -> n.length() > 3).count();
    System.out.println(collect);

  }
}
