package JavaEightDemo;

import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyofWords {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "banana", "apple", "orange", "banana", "apple");
    Map<String, Long> collect = words.stream()
          .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    System.out.println(collect);
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < words.size(); i++) {
      map.put(words.get(i), map.getOrDefault(words.get(i), 0) + 1);
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a, b) -> b.getValue() - a.getValue());
    System.out.println(list);
    list.sort((a, b) -> b.getKey().compareTo(a.getKey()));
    System.out.println(list);
  }
}
