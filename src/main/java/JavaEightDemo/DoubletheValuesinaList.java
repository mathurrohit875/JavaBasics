package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubletheValuesinaList {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

    List<Integer> collect = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
    System.out.println(collect);

  }
}
