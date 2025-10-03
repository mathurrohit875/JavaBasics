package JavaEightPracticeInterview;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of names, find all names that start with the letter "A".
Input:
List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Charlie", "Andrew");
Expected Output:
[Alice, Annie, Andrew]

 */
public class FindNamesStartingwithA {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Charlie", "Andrew");
    List<String> stringList = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
    System.out.println(stringList);
  }
}
