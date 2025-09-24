package LeetCodePrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * The RemoveAllOccurrence class demonstrates how to remove all occurrences
 * of a specific element from a list using Java's removeIf method.
 */
public class RemoveAllOccurrence {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, converts it to a list, removes all
   * occurrences of the number 2, and prints the modified list.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers
    int[] arr = {1, 2, 3, 2, 4, 2};

    // Create a list to store the elements of the array
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      list.add(i); // Add each element of the array to the list
    }

    // Remove all occurrences of the number 2 from the list
    list.removeIf(n -> n == 2);

    // Print the modified list
    System.out.println(list);
  }
}