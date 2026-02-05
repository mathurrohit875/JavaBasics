package JavaEightDemo;

import java.util.Arrays;
import java.util.List;

public class ReducetoFindSumofAllNumbers {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
    int reduce = numbers.stream().reduce(0, (a, b) -> a + b);
    System.out.println(reduce);

  }
}
