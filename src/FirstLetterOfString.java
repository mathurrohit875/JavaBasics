import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterOfString {
  public static void main(String[] args) {
    String str = "Hello World Hi I";

    String[] split = str.split(" ");
    for (String s : split) {
      char[] split1 = s.toCharArray();
      System.out.println("split: " + split1[0]);

    }

    Pattern pattern = Pattern.compile("\\b\\w");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      System.out.println("word boundary: " + matcher.group());
    }


  }
}
