package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Use map() to square each element in the list.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
Expected Output:
[1, 4, 9, 16]

 */
public class UseMaptoCreateaListofSquares {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> collect = numbers.stream().map(m -> m * m).collect(Collectors.toList());
    System.out.println(collect);
  }
}
