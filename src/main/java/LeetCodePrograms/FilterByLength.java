package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterByLength {

  public static void main(String[] args) {
    String[] str = {"hi", "hello", "world", "a"};
    int k = 2;
    List<String> list = new ArrayList<>(Arrays.asList(str));
    List<String> re = filterByLength(list, k);
    System.out.println(re);
  }

  public static List<String> filterByLength(List<String> list, int k) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).length() > k) {
        // System.out.println(list.get(i));
        result.add(list.get(i));
      }
    }
    return result;
  }
}
