package LeetCodePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximumandMinimum {

  public static void main(String[] args) {
    int[] arr = {5, 9, 2, 4, 7};
    List<Integer> list = new ArrayList<>(Arrays.asList(5, 9, 2, 4, 7));
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));


    List<String> listString = Arrays.asList("Java", "Python", "C++");
    String[] str1 = listString.toArray(new String[0]);

    for (String s : str1) {
      System.out.println(s);
    }
  }


}
