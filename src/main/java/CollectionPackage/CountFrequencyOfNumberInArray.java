package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class CountFrequencyOfNumberInArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 1, 2};
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      if (list.contains(arr[i])) {
        continue;
      }
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      list.add(arr[i]);

      System.out.println(arr[i] + " occurs " + count + " times");
    }


  }
}
