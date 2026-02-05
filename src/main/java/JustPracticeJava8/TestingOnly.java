package JustPracticeJava8;

public class TestingOnly {

  public static void main(String[] args) {
    String str = "hello world";

    int vowelCount = 0;
    String re = "";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
        vowelCount++;
        if (vowelCount % 2 == 0) {
          ch = Character.toUpperCase(ch);
        }
      }

      re += ch;
    }


    System.out.println("cc: " + re);
  }
}

