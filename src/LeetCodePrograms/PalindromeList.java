package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The PalindromeList class provides functionality to check if a list of integers
 * is a palindrome. A list is considered a palindrome if it reads the same
 * forward and backward.
 */
public class PalindromeList {

  /**
   * The main method is the entry point of the program.
   * It initializes a list of integers, checks if the list is a palindrome,
   * and prints the result.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize a list of integers
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 3, 2, 1));

    // Check if the list is a palindrome
    boolean result = isPalindrome(list);

    // Print the result
    System.out.println(result);
  }

  /**
   * Checks if the given list of integers is a palindrome.
   *
   * @param list The list of integers to check.
   * @return true if the list is a palindrome, false otherwise.
   */
  public static boolean isPalindrome(List<Integer> list) {
    // Iterate through the first half of the list
    for (int i = 0; i < list.size() / 2; i++) {
      // Compare the element at the current index with its counterpart
      // from the end of the list
      if (!list.get(i).equals(list.get(list.size() - i - 1))) {
        return false; // Return false if a mismatch is found
      }
    }
    return true; // Return true if no mismatches are found
  }
}