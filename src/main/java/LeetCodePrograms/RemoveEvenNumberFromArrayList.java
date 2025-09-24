package LeetCodePrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * The RemoveEvenNumberFromArrayList class demonstrates how to filter out
 * even numbers from an array and store the odd numbers in a list.
 */
public class RemoveEvenNumberFromArrayList {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of integers, filters out even numbers,
   * adds the odd numbers to a list, and prints the list.
   * It also demonstrates removing odd numbers from the list using a lambda expression.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of integers
    int[] arr = {1, 2, 3, 4, 5, 6, 7};

    // Create a list to store odd numbers
    List<Integer> list = new ArrayList<>();

    // Iterate through the array and add odd numbers to the list
    for (int i : arr) {
      if (i % 2 != 0) {
        list.add(i);
      }
    }

    // Print the list of odd numbers
    System.out.println(list);

    // Remove all odd numbers from the list using a lambda expression
    list.removeIf(num -> num % 2 != 0);
  }
}