package LeetCodePrograms;

import java.util.Arrays;
import java.util.List;

public class CheckifTwoListsareEqual {

  public static void main(String[] args) {

    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(1, 2, 4);
    System.out.println(list1.equals(list2));
  }
}
