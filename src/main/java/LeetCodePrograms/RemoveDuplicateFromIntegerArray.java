package LeetCodePrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * The RemoveDuplicateFromIntegerArray class demonstrates how to remove duplicate
 * integers from an array and store the unique integers in a list.
 */
public class RemoveDuplicateFromIntegerArray {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, removes duplicates by adding only unique
   * integers to a list, and prints the list of unique integers.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers with duplicate values
    int[] arr = {1, 2, 2, 3, 4, 4, 5};

    // Create a list to store unique integers
    List<Integer> list = new ArrayList<>();

    // Iterate through the array
    for (int i : arr) {
      // Add the integer to the list if it is not already present
      if (!list.contains(i)) {
        list.add(i);
      }
    }

    // Print the list of unique integers
    System.out.println(list);
  }
}