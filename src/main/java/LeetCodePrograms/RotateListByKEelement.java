package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListByKEelement {
  public static void main(String[] args) {
    int k = 2;
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    rotateRight(list, k);

    for (int num : list) {
      System.out.print(num + " ");
    }
  }

  public static List<Integer> rotateRight(List<Integer> list, int k) {
    int n = list.size();
    k = k % n;
    reverse(list, 0, n - 1);         // Step 1
    reverse(list, 0, k - 1);         // Step 2
    reverse(list, k, n - 1);
    return list;
  }

  static void reverse(List<Integer> list, int start, int end) {
    while (start < end) {
      int temp = list.get(start);
      list.set(start, list.get(end));
      list.set(end, temp);
      start++;
      end--;
    }
  }
}
