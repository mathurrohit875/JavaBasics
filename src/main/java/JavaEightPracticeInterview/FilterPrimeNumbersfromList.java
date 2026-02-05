package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem:
From a list of integers, return all prime numbers.
Input:
List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
Expected Output:
[2, 3, 5, 7]

 */
public class FilterPrimeNumbersfromList {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> collect = numbers
          .stream()
          .filter(FilterPrimeNumbersfromList::isPrime)
          .collect(Collectors.toList());
    System.out.println(collect);


  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
