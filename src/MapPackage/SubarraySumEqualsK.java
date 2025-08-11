package MapPackage;

import java.util.HashMap;
import java.util.Map;

/**
 * The SubarraySumEqualsK class provides a solution to find the number of subarrays
 * in an array that sum up to a given value k using a prefix sum and a hashmap.
 */
public class SubarraySumEqualsK {

  /**
   * The main method is the entry point of the program.
   * It calculates the number of subarrays in a given array that sum up to a target value k
   * and prints the result.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize the input array and target sum
    int[] arr = {1, 2, 3};
    int k = 3;

    // Create a map to store prefix sums and their frequencies
    Map<Integer, Integer> prefixSumMap = new HashMap<>();
    prefixSumMap.put(0, 1); // To handle subarrays that start from index 0

    // Initialize variables to track the count of subarrays and the current prefix sum
    int count = 0;
    int currentSum = 0;

    // Iterate through the array
    for (int num : arr) {
      // Update the current prefix sum
      currentSum += num;

      // Check if there's a prefix sum such that: currentSum - prefixSum = k
      if (prefixSumMap.containsKey(currentSum - k)) {
        // Increment the count by the frequency of the matching prefix sum
        count += prefixSumMap.get(currentSum - k);
      }

      // Add the current prefix sum to the map with its frequency
      prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
    }

    // Print the total count of subarrays with sum equal to k
    System.out.println("Number of subarrays: " + count);
  }
}