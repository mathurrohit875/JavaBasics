package MapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "as");
    map.put(2, "ascss");
    map.put(3, "cscsdc");
    map.put(4, "scscs");
    map.put(5, "aschres");
    Set<Integer> integers = map.keySet();
    for (Integer intege : map.keySet()) {
      System.out.println(map.get(intege));
    }
    Set<Map.Entry<Integer, String>> entries = map.entrySet();
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());

    }
  }
}
