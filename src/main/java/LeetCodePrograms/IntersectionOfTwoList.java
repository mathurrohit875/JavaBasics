package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoList {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 2, 2, 2, 2));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 2, 4, 2, 2, 2));
    List<Integer> intersection = intersect(list1, list2);
    System.out.println(intersection);  // Output: [2, 2]
  }

  public static List<Integer> intersect(List<Integer> list1, List<Integer> list2) {
    List<Integer> tempList = new ArrayList<>(list2);
    List<Integer> result = new ArrayList<>();
    for (Integer num : list1) {
      if (tempList.contains(num)) {
        result.add(num);
        tempList.remove(num);
      }
    }
    return result;
  }
}
