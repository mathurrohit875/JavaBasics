package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsbyLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "kiwi");

    List<String> collect = words.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.toList());
    System.out.println(collect);
    List<String> collect1 = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    System.out.println(collect1);
  }
}
