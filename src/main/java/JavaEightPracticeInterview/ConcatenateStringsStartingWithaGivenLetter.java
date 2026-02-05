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

    //using stream
    String b = names.stream()
          .filter(name -> name.startsWith("B"))
          .collect(Collectors.joining(""));
    System.out.println(b);

    //using for loop
    String nam = "";
    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).startsWith("B")) {
        nam += names.get(i);
      }
    }
    System.out.println(nam);

    //using stringbuilder
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).startsWith("B")) {
        sb.append(names.get(i));
      }
    }
    System.out.println(sb);


  }
}
