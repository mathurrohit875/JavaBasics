package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortStringsAlphabetically {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Zoe", "Adam", "John", "Bella");
    List<String> collect = names.stream()
          .sorted()
          .collect(Collectors.toList());
    System.out.println(collect);
    List<String> collectReverseOrder = names.stream()
          .sorted(Comparator.reverseOrder())
          .collect(Collectors.toList());
    System.out.println(collectReverseOrder);

  }
}
