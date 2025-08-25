package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNamesStartingwithA {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("hc", "suy", "aa", "abcd");
    System.out.println(list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList()));


  }
}
