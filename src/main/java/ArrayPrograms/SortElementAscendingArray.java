package ArrayPrograms;

public class SortElementAscendingArray {

  public static void main(String[] args) {
    int[] arr = {2, 23, 24, 1, 25};

    int temp;
    int[] asc = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {

      for (int j = (i + 1); j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }

      }
      System.out.println("aa: " + arr[i]);

    }
    System.out.println();
  }
}
