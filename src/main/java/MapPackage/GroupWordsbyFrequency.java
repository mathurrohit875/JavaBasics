package MapPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsbyFrequency {

  public static void main(String[] args) {
    String[] str = {"cat", "dog", "dog", "mouse", "cat", "cat"};
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length; i++) {
      map.put(str[i], map.getOrDefault(str[i], 0) + 1);
    }
    System.out.println(map.entrySet());
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    for (Map.Entry<String, Integer> m : list) {
      System.out.println(m.getKey() + "->" + m.getValue());

    }
  }
}
