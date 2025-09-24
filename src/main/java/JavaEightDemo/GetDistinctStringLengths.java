package JavaEightDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetDistinctStringLengths {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "bye", "hi", "world");

    List<Integer> list = words.stream().map(n -> n.length()).distinct().collect(Collectors.toList());
    System.out.println(list);
    list.forEach(System.out::println);
    List<Integer> dupWords = new ArrayList<>();

    for (int i = 0; i < words.size(); i++) {
      for (int j = 0; j < words.size(); j++) {
        if (words.get(i).length() == words.get(j).length()) {
          if (!dupWords.contains(words.get(i).length())) {
            dupWords.add(words.get(i).length());

          }
        }
      }
    }
    System.out.println(dupWords);


  }
}
