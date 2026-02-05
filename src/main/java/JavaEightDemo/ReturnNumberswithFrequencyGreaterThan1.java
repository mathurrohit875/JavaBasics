package JavaEightDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnNumberswithFrequencyGreaterThan1 {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : nums) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> h : hm.entrySet()) {
      if (h.getValue() > 1) {
        System.out.println(h.getKey());
      }
    }

    List<Integer> collect = nums
          .stream()
          .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
          .entrySet()
          .stream()
          .filter(en -> en.getValue() > 1)
          .map(Map.Entry::getKey)
          .collect(Collectors.toList());

    System.out.println(collect);
  }
}
