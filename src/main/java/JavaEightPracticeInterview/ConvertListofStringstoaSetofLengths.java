package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Problem:
Convert a list of strings into a set of their lengths.
Input:
List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Bob");
Expected Output:
[3, 5, 4] // as a Set, order may vary

 */
public class ConvertListofStringstoaSetofLengths {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Bob");
    Set<Integer> collect = names.stream().map(n -> n.length()).collect(Collectors.toSet());
    System.out.println(collect);
  }
}
