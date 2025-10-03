package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Return a list of numbers that appear more than once.
Input:
List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
Expected Output:
[1, 2]

 */
public class ReturnNumberswithFrequencyGreaterThanOne {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : nums) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);

    }
    for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
      if (m.getValue() > 1) {
        System.out.println(m.getKey());
      }
    }
    List<Integer> collect = nums
          .stream()
          .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
          .entrySet().stream()
          .filter(n -> n.getValue() > 1)
          .map(Map.Entry::getKey)
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
