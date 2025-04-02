package StringPrograms;

public class Palindrome {
//palindrome string means which looks same when written from front to back or back to front
  // example: madam.. madam when written from any where will look same.
  public static void main(String[] args) {
    String str = "madam";
    boolean b = true;
    for (int i = 0; i < str.length() / 2; i++) {
      System.out.println("str.charAt(i): "+str.charAt(i));
      System.out.println("str.charAt(str.length() - 1 - i: "+((str.charAt(str.length() - 1 - i))));
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        b = false;
        break;
      }
    }if (b) {
      System.out.println("pal");
    } else {
      System.out.println("no pal");
    }

  }
}
