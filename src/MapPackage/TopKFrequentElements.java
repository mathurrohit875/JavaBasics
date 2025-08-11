package MapPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
  public static void main(String[] args) {
    int[] arr = {1, 1, 1, 2, 2, 3};
    int k = 2;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      result.add(list.get(i).getKey());

    }
    System.out.println(result);
    //System.out.println(map.entrySet());
  }
}
