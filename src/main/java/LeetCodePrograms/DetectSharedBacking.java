package LeetCodePrograms;

import java.util.Arrays;
import java.util.List;

/**
 * The DetectSharedBacking class demonstrates how to detect if a list
 * created using Arrays.asList() shares the same backing array as the original array.
 */
public class DetectSharedBacking {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, checks if a list created from the array
   * shares the same backing array, and prints the result.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers
    Integer[] arr = {1, 2, 3};

    // Check if the list shares the same backing array as the original array
    boolean result = isListBackedByArray(arr);

    // Print the result
    System.out.println(result);
  }

  /**
   * Checks if a list created using Arrays.asList() shares the same backing array
   * as the original array by modifying the list and verifying the change in the array.
   *
   * @param arr The array of integers to be checked.
   * @return true if the list shares the same backing array, false otherwise.
   */
  public static boolean isListBackedByArray(Integer[] arr) {
    // Create a list from the array
    List<Integer> result = Arrays.asList(arr);

    // Modify an element in the list
    result.set(1, 999);

    // Check if the change is reflected in the original array
    return arr[1] == 999;
  }
}