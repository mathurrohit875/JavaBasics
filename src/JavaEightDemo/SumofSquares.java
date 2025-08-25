package JavaEightDemo;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    int collect = nums.stream()
          .map(x -> (x * x))
          .reduce(0, (a, b) -> a + b);
    System.out.println(collect);
    int sum = nums.stream()
          .map(x -> (x * x))
          .mapToInt(Integer::intValue).sum();
    System.out.println(sum);
    int sum1 = nums.stream().mapToInt(Integer::intValue).sum();
    System.out.println(sum1);
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    Integer reduce = list.stream().reduce(0, Integer::sum);
    System.out.println(reduce);
  }
}
