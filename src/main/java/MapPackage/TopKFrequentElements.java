package MapPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The TopKFrequentElements class provides a solution to find the top K most frequent
 * elements in an array using a HashMap and sorting.
 */
public class TopKFrequentElements {

  /**
   * The main method is the entry point of the program.
   * It calculates the top K most frequent elements in a given array and prints the result.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Initialize the input array and the value of K
    int[] arr = {1, 1, 1, 2, 2, 3};
    int k = 2;

    // Create a HashMap to store the frequency of each element
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      // Update the frequency of the current element
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    // Convert the map entries to a list for sorting
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

    // Sort the list in descending order of frequency
    list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

    // Create a list to store the top K frequent elements
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      // Add the key of the top K entries to the result list
      result.add(list.get(i).getKey());
    }

    // Print the list of top K frequent elements
    System.out.println(result);
    // Uncomment the following line to print the map entries
    // System.out.println(map.entrySet());
  }
}