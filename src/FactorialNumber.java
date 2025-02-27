public class FactorialNumber {

  public static void main(String[] args) {

    int num = 5; // Example input
    long factorial = 1;
    System.out.print(num + "! = ");
    for (int i = num; i >= 1; i--) {
      factorial *= i;
      System.out.print(i);
      if (i > 1) {
        System.out.print(" * ");
      }
    }
    System.out.print(" = " + factorial);
    System.out.println();
    int newNum = 5;
    int fac=1;
    for (int j = 1; j <=newNum; j++) {
      fac *= j;

    }
    System.out.println("factorial of: " + newNum + " is: " + fac);

  }
}
