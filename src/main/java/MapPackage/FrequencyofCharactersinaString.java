package MapPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyofCharactersinaString {

  public static void main(String[] args) {
    String str = "hello";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }
    for (Map.Entry<Character, Integer> c : map.entrySet()) {
      System.out.println(c.getKey() + " " + c.getValue());

    }
    for (char c : map.keySet()) {
      System.out.println(c + " " + map.get(c));
    }
    List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
    for (Map.Entry<Character, Integer> c : list) {
      System.out.println("lest : " + c.getKey() + " " + c.getValue());

    }
    System.out.println(" wat" + map.entrySet());
  }

}
