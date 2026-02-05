package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  Problem:
Sort a list of strings in alphabetical order using streams.
Input:
List<String> names = Arrays.asList("Zoe", "Adam", "John", "Bella");
Expected Output:
[Adam, Bella, John, Zoe]

   */
public class SortStringsAlphabetically {


  public static void main(String[] args) {
    List<String> names = Arrays.asList("Zoe", "Adam", "John", "Bella");
    List<String> sorted = names.stream().sorted().collect(Collectors.toList());
    System.out.println(sorted);
  }
}
