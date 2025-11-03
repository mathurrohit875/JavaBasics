package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of lists of integers, flatten it into a single list.
Input:
List<List<Integer>> lists = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4),
    Arrays.asList(5, 6)
);
Expected Output:
[1, 2, 3, 4, 5, 6]

 */
public class UseflatMaptoCombineLists {

  public static void main(String[] args) {
    List<List<Integer>> lists = Arrays.asList(
          Arrays.asList(1, 2),
          Arrays.asList(3, 4),
          Arrays.asList(5, 6)
    );
    List<Integer> collect = lists
          .stream()
          .flatMap(m -> m.stream())
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
