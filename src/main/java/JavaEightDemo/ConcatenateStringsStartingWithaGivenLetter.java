package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringsStartingWithaGivenLetter {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Bob", "Alice", "Bruno", "Bella", "David");
    String nameWithB = "";
    String collect = names.stream()
          .filter(n -> n.startsWith("B"))
          .collect(Collectors.joining(""));
    System.out.println("1. " + collect);
    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).startsWith("B")) {
        nameWithB += names.get(i);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (String an : names) {
      if (an.startsWith("B")) {
        sb.append(an);
      }
    }
    sb.reverse();
    System.out.println("2. " + sb);
    System.out.println("3. " + nameWithB);

  }
}
