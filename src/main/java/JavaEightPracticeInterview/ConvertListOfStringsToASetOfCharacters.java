package JavaEightPracticeInterview;

import java.util.ArrayList;
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

    //using stream set
    Set<Character> collectSet = words.stream()
          .flatMap(m -> m.chars().mapToObj(c -> (char) c))
          .collect(Collectors.toSet());
    System.out.println(collectSet);

    //using stream list
    List<Character> collectList = words.stream()
          .flatMap(c -> c.chars().mapToObj(m -> (char) m))
          .collect(Collectors.toList());
    System.out.println(collectList);

    //Using for loop
    List<Character> li = new ArrayList<>();
    for (String word : words) {

      for (int j = 0; j < word.length(); j++) {
        char ch = word.charAt(j);
        li.add(ch);
      }
    }
    System.out.println(li);

  }
}
