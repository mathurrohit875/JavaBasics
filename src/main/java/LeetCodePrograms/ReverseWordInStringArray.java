package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The ReverseWordInStringArray class provides functionality to reverse
 * each word in a list of strings.
 */
public class ReverseWordInStringArray {

  /**
   * The main method is the entry point of the program.
   * It initializes a list of strings, reverses each word in the list,
   * and prints the resulting list.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {

    // Initialize a list of strings
    List<String> list = new ArrayList<>(Arrays.asList("java", "is", "fun", "hello"));

    // Reverse each word in the list
    List<String> list2 = reverseWords(list);

    // Print the reversed list
    System.out.println(list2);
  }

  /**
   * Reverses each word in the given list of strings.
   *
   * @param list The list of strings to be reversed.
   * @return A new list containing the reversed words.
   */
  public static List<String> reverseWords(List<String> list) {
    // Create a new list to store the reversed words
    List<String> list2 = new ArrayList<>();
    String rev = "";

    // Iterate through each word in the list
    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);

      // Reverse the current word
      for (int j = 0; j < str.length(); j++) {
        char c = str.charAt(j);
        rev = c + rev;
      }

      // Add the reversed word to the new list
      list2.add(rev);
      rev = ""; // Reset the reversed string for the next word
    }

    // Return the list of reversed words
    return list2;
  }
}