package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPrimeNumbersfromList {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> collect = numbers.stream().filter(FilterPrimeNumbersfromList::isPrime).collect(Collectors.toList());
    System.out.println(collect);


  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int j = 2; j <= Math.sqrt(num); j++) {
      if (num % j == 0) {
        return false;
      }
    }
    return true;
  }

}
