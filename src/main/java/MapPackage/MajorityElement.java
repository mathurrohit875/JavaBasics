package MapPackage;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public static void main(String[] args) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int n = arr.length;

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    boolean found = false;
    for (Map.Entry<Integer, Integer> i : map.entrySet()) {
      if (i.getValue() > (n / 2)) {
        found = true;
        System.out.println(i.getKey());
        break;
      }
    }
    if (!found) {
      System.out.println("no found");

    }


  }
}
