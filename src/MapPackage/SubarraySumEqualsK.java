package MapPackage;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int k = 3;
    Map<Integer, Integer> prefixSumMap = new HashMap<>();
    prefixSumMap.put(0, 1); // To handle subarrays that start from index 0

    int count = 0;
    int currentSum = 0;

    for (int num : arr) {
      currentSum += num;

      // Check if there's a prefix sum such that: currentSum - prefixSum = k
      if (prefixSumMap.containsKey(currentSum - k)) {
        count += prefixSumMap.get(currentSum - k);
      }

      // Add currentSum to the map
      prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
    }

    System.out.println("Number of subarrays: " + count);
  }

}
