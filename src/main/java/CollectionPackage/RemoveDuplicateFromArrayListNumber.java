package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArrayListNumber {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 4, 1};
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {

      if (!list.contains(i)) {
        list.add(i);
      }
    }

    System.out.println(list);

  }
}
