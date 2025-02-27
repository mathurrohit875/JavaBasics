public class LargestBetweenThreeNumbers {

  public static void main(String[] args) {
    int i = 30;
    int j = 60;
    int k = 10;


    if (i > j && i > k) {

      System.out.println("highest is i: " + i);
    } else if (j > i && j > k) {

      System.out.println("highest is j " + j);
    } else {
      System.out.println("k is highest: " + k);
    }

    int largest = k > (i > j ? i : j) ? k : ((i > j ? i : j));
    System.out.println("i > j ? i : j "+(i > j ? i : j));

    System.out.println("print" + largest);
  }


}
