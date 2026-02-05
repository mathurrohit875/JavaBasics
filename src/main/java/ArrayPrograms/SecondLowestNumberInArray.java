package ArrayPrograms;

public class SecondLowestNumberInArray {


  public static void main(String[] args) {
    int[] arr = {2, 57, 23, 92, 62, 47, 3};
    int min ;
    for (int i = 0; i < arr.length; i++) {
      for (int j = (i + 1); j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          min = arr[i];
          arr[i] = arr[j];
          arr[j] = min;
        }

      }
      // System.out.println("second lowest: ");

    }
    System.out.println(arr[1]);
  }
}
