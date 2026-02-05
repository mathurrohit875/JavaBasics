package JavaEightPracticeInterview;

import java.util.HashSet;

public class DeleteClass {

  public static void main(String[] args) {
    int[] arr = {10, 20, 50, 30, 50};
    HashSet<Integer> hs = new HashSet<>();
    for (int i : arr) {
      hs.add(i);
    }
    System.out.println(hs);
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    for (int n : hs) {
      if (n > highest) {
        secondHighest = highest;
        highest = n;
      } else if (n > secondHighest) {
        secondHighest = n;
      }
    }
    System.out.println(secondHighest);


  }

}

