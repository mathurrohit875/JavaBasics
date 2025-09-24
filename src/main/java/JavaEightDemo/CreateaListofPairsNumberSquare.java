package JavaEightDemo;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateaListofPairsNumberSquare {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<AbstractMap.SimpleEntry<Integer, Integer>> collect = numbers.stream().map(n -> new AbstractMap.SimpleEntry<>(n, n * n)).collect(Collectors.toList());
    System.out.println(collect);
  }
}
