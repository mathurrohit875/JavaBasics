package JavaEightDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersinAscendingOrder {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 1, 9, 7, 3);

    List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
    System.out.println(collect);

    List<Integer> collect1 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(collect1);


  }
}

