package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsbyLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hey", "world");

    Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(s -> s.length()));

    System.out.println(collect);

  }
}
