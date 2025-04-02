package ArrayPrograms;

public class ReverseArray {
  public static void main(String[] args) {

    int[] arr = {2, 1, 2, 31, 3, 42, 124, 25};
    int[] newArr = new int[arr.length];
    for (int i = 0; i <arr.length; i++) {
      newArr[i]=arr[arr.length-1-i];
      System.out.print(newArr[i]);
      System.out.print(",");
      //newArr[i] = arr[i];
      //System.out.println("new arr: " + newArr[i]);
    }
    /*for (int i : newArr) {
      System.out.println("new " + i);
    }*/

  }
}
