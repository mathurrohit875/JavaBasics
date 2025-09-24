package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstRepeatingElement {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 4, 5, 4, 2));
    int result = firstRepeating(list);
    System.out.println(result);

  }

  public static int firstRepeating(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          return list.get(i);
        }
      }

    }
    return -1;
  }
}
