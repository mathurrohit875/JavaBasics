package ArrayPrograms;

public class SumAllElementsInArray {

  public static void main(String[] args){
    int[] arr={2,21,3,1,34,23,213};
    int sum=0;
    for (int j : arr) {
      sum += j;
    }
    System.out.println("sum: "+sum);
  }
}
