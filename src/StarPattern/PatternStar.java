package StarPattern;

public class PatternStar {

  public static void main(String[] args) {

    String str = "*";
    int count = 1;
    int n = 3;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count++;

      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");

      }
      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count++;
      }
      //count++;
      System.out.println();
    }
  }
}

