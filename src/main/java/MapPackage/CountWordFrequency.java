package MapPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordFrequency {

  public static void main(String[] args) {
    String str = "apple banana apple orange banana apple";
    HashMap<String, Integer> map = new HashMap<>();
    String[] s = str.split(" ");
    for (int i = 0; i < s.length; i++) {

      map.put(s[i], map.getOrDefault(s[i], 0) + 1);
    }
    for (Map.Entry<String, Integer> str1 : map.entrySet()) {
      System.out.println(str1.getKey() + " " + str1.getValue());
    }
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    //System.out.println(list);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());

    }
  }
}
