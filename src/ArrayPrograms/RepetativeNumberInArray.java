package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class RepetativeNumberInArray {

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 2, 2, 4, 5};
    List<Integer> li = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println("!li.contains(arr[i]: "+(li.contains(arr[i])));
          if (!li.contains(arr[i])) {
            System.out.println("this is reL " + arr[i]);
            li.add(i);
          }
          break;
        }
      }

    }

  }
}
