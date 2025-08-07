package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    List<Integer> list = new ArrayList<>();

    for (int i : arr) {
      list.add(i);
    }

    Collections.reverse(list);
    System.out.println(list);


  }
}
