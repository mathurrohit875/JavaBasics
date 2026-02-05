package JavaEightLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ComparatorDemo {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(2);
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    list.sort((a, b) -> b - a);
    System.out.println(list);

    String str = "hello worlaad hello";
    HashMap<String, Integer> map = new HashMap<>();
    String[] split = str.split(" ");
    for (int i = 0; i < split.length; i++) {
      map.put(split[i], map.getOrDefault(split[i], 0) + 1);
    }
    map.entrySet()
          .stream()
          .sorted((a, b) -> b.getKey().length() - a.getKey().length())
          .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
  }
}
