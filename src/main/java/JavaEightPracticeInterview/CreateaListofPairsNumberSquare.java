package JavaEightPracticeInterview;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
Create a list of pairs where each pair is a number and its square.
Input:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
Expected Output:
[(1, 1), (2, 4), (3, 9), (4, 16)]

 */
public class CreateaListofPairsNumberSquare {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<AbstractMap.SimpleEntry<Integer, Integer>> collect = numbers.stream().map(n -> new AbstractMap.SimpleEntry<>(n, n)).collect(Collectors.toList());
    System.out.println(collect);
    collect.forEach(entry -> System.out.println(entry.getKey() + "," + entry.getValue()));


  }
}
