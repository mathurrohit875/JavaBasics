package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Problem:
Convert a list of strings into a set of characters (i.e., a set containing each unique character from all strings).
Input:
List<String> words = Arrays.asList("cat", "dog");
Expected Output:
[c, a, t, d, o, g]

 */
public class ConvertListOfStringsToASetOfCharacters {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "dog");
    Set<Character> collect = words.stream().flatMap(m -> m.chars().mapToObj(c -> (char) c)).collect(Collectors.toSet());
    System.out.println(collect);

  }
}
