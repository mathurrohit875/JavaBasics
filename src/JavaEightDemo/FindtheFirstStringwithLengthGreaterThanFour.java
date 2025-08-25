package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindtheFirstStringwithLengthGreaterThanFour {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "tiger", "bat", "elephant");
    words.stream().filter(n -> n.length() > 4).findFirst().ifPresent(System.out::println);
    List<String> collect = words.stream().filter(n -> n.length() > 4).limit(1).collect(Collectors.toList());
    System.out.println(collect);


  }
}
