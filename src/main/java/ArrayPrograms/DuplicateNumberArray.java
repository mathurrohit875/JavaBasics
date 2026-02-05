package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberArray {

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 1, 2, 4, 3, 4, 2};
    // Iterate through the array
    for (int i = 0; i < arr.length; i++) {
      // Skip the number if it's already counted as a duplicate
      boolean alreadyCounted = false;
      for (int k = 0; k < i; k++) {
        if (arr[i] == arr[k]) {
          alreadyCounted = true;
          break;
        }
      }

      // If already counted, skip this number
      if (alreadyCounted) {
        continue;
      }

      // Count occurrences of arr[i]
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }

      // Only print numbers that appear more than once
      if (count > 1) {
        System.out.println("Number: " + arr[i] + " Count: " + count);
      }
    }
    int[] arr1 = {1, 2, 3, 1, 2};
    List<Integer> ar = new ArrayList<>();
    for (int i : arr1) {
      ar.add(i);
    }
    List<Integer> collect = ar.stream().distinct().collect(Collectors.toList());
    System.out.println(collect);
  }
}

