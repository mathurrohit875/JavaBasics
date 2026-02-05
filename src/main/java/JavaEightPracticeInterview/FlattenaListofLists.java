package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Given a list of lists, flatten it to a single list.
Input:
List<List<Integer>> list = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4),
    Arrays.asList(5)
);
Expected Output:
[1, 2, 3, 4, 5]

 */
public class FlattenaListofLists {

  public static void main(String[] args) {
    List<List<Integer>> list = Arrays.asList(
          Arrays.asList(1, 2),
          Arrays.asList(3, 4),
          List.of(5)
    );
    List<Integer> collect = list.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
    System.out.println(collect);
  }
}
