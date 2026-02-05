package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.HashSet;
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
    //using stream
    Set<Integer> collect = names.stream().map(String::length).collect(Collectors.toSet());
    System.out.println(collect);
    //using for loop
    Set<Integer> set = new HashSet<>();
    for (String s : names) {
      set.add(s.length());
    }
    System.out.println(set);
  }
}
