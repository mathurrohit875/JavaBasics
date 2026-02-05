package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Return common elements between two lists.
Input:
List<Integer> a = Arrays.asList(1, 2, 3, 4);
List<Integer> b = Arrays.asList(3, 4, 5, 6);
Expected Output:
[3, 4]

 */
public class FindCommonElementsBetweenTwoLists {

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(1, 2, 3, 4);
    List<Integer> b = Arrays.asList(3, 4, 5, 6);
    List<Integer> collect = a
          .stream()
          .filter(b::contains)
          .collect(Collectors.toList());
    System.out.println(collect);
  }
}
