package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListAlternatively {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<String> list2 = new ArrayList<>(Arrays.asList("x", "y", "d", "e"));
    List<String> list3 = mergeAlternating(list1, list2);
    System.out.println(list3);
  }

  public static List<String> mergeAlternating(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int i = 0;
    int n1 = list1.size();
    int n2 = list2.size();

    // Add elements alternately
    while (i < n1 || i < n2) {
      if (i < n1) result.add(list1.get(i));
      if (i < n2) result.add(list2.get(i));
      i++;
    }

    return result;
  }
}
