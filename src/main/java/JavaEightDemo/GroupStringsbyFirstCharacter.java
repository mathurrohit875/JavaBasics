package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsbyFirstCharacter {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");

    Map<Character, List<String>> collect = words.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
    System.out.println(collect);


  }
}
