package JavaEightDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterandSortNumbersinDescendingOrder {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(3, 7, 2, 10, 6);
    List<Integer> newNum = new ArrayList<>();
    for (int i : nums) {
      if (i > 5) {
        newNum.add(i);
      }
    }
    newNum.sort((a, b) -> b - a);
    System.out.println(newNum);

    List<Integer> collect = nums.stream()
          .filter(n -> n > 5)
          .sorted((a, b) -> b - a)
          .collect(Collectors.toList());
    List<Integer> collect1 = nums.stream()
          .filter(n -> n > 5)
          .sorted(Comparator.reverseOrder())
          .collect(Collectors.toList());
    System.out.println(collect);
    System.out.println(collect1);
  }
}
