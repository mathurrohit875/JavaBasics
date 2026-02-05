package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListofStringstoaSetofLengths {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Bob");

    Set<Integer> collect = names.stream().map(n -> n.length()).collect(Collectors.toSet());
    System.out.println(collect);


  }
}
