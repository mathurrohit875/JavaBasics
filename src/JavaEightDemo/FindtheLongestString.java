package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindtheLongestString {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("car", "elephant", "trainfdddd", "plane");
    String longestWord = "";
    for (int i = 0; i < words.size(); i++) {
      for (int j = i + 1; j < words.size(); j++) {
        if (words.get(i).length() > words.get(j).length()) {
          longestWord = words.get(i);
          break;
        }
      }
    }
    words.sort((a, b) -> b.length() - a.length());
    System.out.println(words.get(0));
    System.out.println(longestWord);
    words.stream().max((a, b) -> a.length() - b.length()).ifPresent(System.out::println);
    words.stream().max(Comparator.comparing(n -> n.length())).ifPresent(System.out::println);


  }
}
