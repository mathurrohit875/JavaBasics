package ListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A program to demonstrate sorting a list of integers in ascending order
 * using the Collections.sort() method.
 */
public class SortingList {
  /**
   * The main method where the program execution begins.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(3);
    Collections.sort(list);
    System.out.println("collectino sor: " + list);
  }
}
