package LeetCodePrograms;

import java.util.Arrays;
import java.util.List;

/**
 * The ReflectChanges class demonstrates how changes made to a list
 * created using Arrays.asList() reflect in the original array.
 */
public class ReflectChanges {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, modifies a list created from the array,
   * and prints the modified array to show the reflection of changes.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers
    Integer[] arr = {10, 20, 30};

    // Call the method to modify the list and reflect changes in the array
    Integer[] result = changeListReflectsInArray(arr);

    // Print the modified array
    System.out.println(Arrays.toString(result));
  }

  /**
   * Converts an array to a list using Arrays.asList(), modifies an element
   * in the list, and returns the original array to show the reflection of changes.
   *
   * @param arr The array of integers to be converted and modified.
   * @return The original array with the reflected changes.
   */
  public static Integer[] changeListReflectsInArray(Integer[] arr) {
    // Create a list from the array
    List<Integer> list = Arrays.asList(arr);

    // Modify an element in the list
    list.set(1, 99);

    // Return the original array with the reflected changes
    return arr;
  }
}