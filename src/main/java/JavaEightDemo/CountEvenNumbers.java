package JavaEightDemo;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbers {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

    long count = nums.stream().filter(n -> n % 2 == 0).count();
    System.out.println(count);
    int countNum = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        countNum++;

      }

    }
    System.out.println(countNum);

  }
}
