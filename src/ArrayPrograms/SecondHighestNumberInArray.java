package ArrayPrograms;

public class SecondHighestNumberInArray {

  public static void main(String[] args) {

    int[] arr = {2, 3, 4, 51, 8, 52, 35};
    int[] newArr = new int[arr.length];
    int max;
    for (int i = 0; i < arr.length; i++) {

      for (int j = (i + 1); j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          max = arr[i];
          arr[i] = arr[j];
          arr[j] = max;
        }
      }
      System.out.println(arr[i]);
    }
    System.out.println(arr[1]);

  }
}
