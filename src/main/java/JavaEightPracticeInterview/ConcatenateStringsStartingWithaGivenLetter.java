package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Concatenate all strings that start with the letter "B".
Input:
List<String> names = Arrays.asList("Bob", "Alice", "Bruno", "Bella", "David");
Expected Output:
"BobBrunoBella"

 */
public class ConcatenateStringsStartingWithaGivenLetter {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Bob", "Alice", "Bruno", "Bella", "David");
    String b = names.stream().filter(n -> n.startsWith("B")).collect(Collectors.joining(""));
    System.out.println(b);

  }
}
