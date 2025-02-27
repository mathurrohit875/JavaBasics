public class ReverseString {

  public static void main(String[] args) {
    String str = "hello world";
    String r = "";
    char c;
    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      r = c + r;
      System.out.println("string " + r);

    }
    System.out.println("final string " + r);
    StringBuilder strB = new StringBuilder();
    strB.append(str);
    strB.reverse();

    System.out.println("print strB " + strB);

  }

}
