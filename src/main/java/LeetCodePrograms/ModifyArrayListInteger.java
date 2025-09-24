package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The ModifyArrayListInteger class demonstrates how to modify an ArrayList
 * by adding an additional element to it.
 */
public class ModifyArrayListInteger {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, converts it to a list, adds an
   * additional element to the list, and prints the modified list.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers
    Integer[] arr = {1, 2, 3};

    // Call the trickyAdd method to modify the list
    List<Integer> list = trickyAdd(arr);

    // Print the modified list
    System.out.println(list);
  }

  /**
   * Converts an array of integers to a list and adds an additional element to it.
   *
   * @param arr The array of integers to be converted and modified.
   * @return A list containing the elements of the array and the additional element.
   */
  public static List<Integer> trickyAdd(Integer[] arr) {
    // Create a list from the array
    List<Integer> list = new ArrayList<>(Arrays.asList(arr));

    // Add an additional element to the list
    list.add(999);

    // Return the modified list
    return list;
  }
}