package LeetCodePrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * The FilterStringsThatStartwithVowel class demonstrates how to filter strings
 * that start with a vowel from an array, remove duplicates, and store them in a list.
 */
public class FilterStringsThatStartwithVowel {

  /**
   * The main method is the entry point of the program.
   * It initializes an array of strings, filters strings that start with a vowel,
   * removes duplicates, and prints the resulting list.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize an array of strings
    String[] str = {"apple", "banana", "orange", "grape", "umbrella", "ebola", "apple"};

    // Create a list to store strings that start with a vowel
    List<String> list = new ArrayList<>();

    // Iterate through the array
    for (int i = 0; i < str.length; i++) {
      // Get the current string
      String word = str[i];

      // Get the first character of the string
      char c = word.charAt(0);

      // Check if the first character is a vowel
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        // Add the string to the list if it is not already present
        if (!list.contains(word)) {
          list.add(word);
        }
      }
    }

    // Print the list of strings that start with a vowel
    System.out.println(list);
  }
}