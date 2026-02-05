package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Given a list of words, count the frequency of each word.
Input:
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
Expected Output:
{apple=3, banana=2, orange=1}

 */
public class CountFrequencyofWords {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

    HashMap<String, Integer> hm = new HashMap<>();
    for (String i : words) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (Map.Entry<String, Integer> m : hm.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }

    Map<String, Long> collect = words
          .stream()
          .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    System.out.println(collect);


  }
}
