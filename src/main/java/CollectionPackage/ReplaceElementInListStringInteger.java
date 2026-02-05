package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementInListStringInteger {

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40};
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      list.add(i);

    }
    list.set(1, 25);
    System.out.println(list);


  }
}
