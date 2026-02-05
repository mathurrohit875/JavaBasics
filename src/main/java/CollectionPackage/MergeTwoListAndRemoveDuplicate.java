package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoListAndRemoveDuplicate {

  public static void main(String[] args) {
    int[] A = {1, 2, 3};
    int[] B = {2, 3, 4};
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    for (int i : A) {
      list1.add(i);
    }
    for (int j : B) {
      list2.add(j);

    }
    list1.addAll(list2);
    System.out.println("list1: " + list1);
    List<Integer> list3 = new ArrayList<>();
    for (int k : list1) {

      if (!list3.contains(k)) {
        list3.add(k);
      }

    }
    System.out.println(list3);


  }
}
