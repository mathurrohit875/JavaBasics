package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class SecondHighestFromArrayList {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      if (!list.contains(i)) {
        list.add(i);
      }
    }
    list.sort((o1, o2) -> o2 - o1);
    System.out.println(list);
    System.out.println(list.get(1));
  }
}
