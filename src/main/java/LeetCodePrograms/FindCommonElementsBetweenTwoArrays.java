package LeetCodePrograms;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementsBetweenTwoArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 2, 3, 1};
    int[] arr2 = {2, 3, 4, 3, 5};
    List<Integer> list = new ArrayList<>();
    for (int i : arr1) {
      if (!list.contains(i)) {
        list.add(i);

      }
      for (int j : arr2) {
        if (!list.contains(j)) {
          list.add(j);
        }
      }
    }
    System.out.println(list);
  }
}
