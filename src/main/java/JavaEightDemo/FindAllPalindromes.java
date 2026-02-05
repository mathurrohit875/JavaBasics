package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPalindromes {

  public static void main(String[] args) {
    String str = "racecar";
    boolean pal = true;
    for (int i = 0; i < str.length() / 2; i++) {

      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        pal = false;
        break;
      }
    }
    if (pal) {
      System.out.println("pal");
    }

    List<String> words = Arrays.asList("madam", "car", "racecar", "apple");
    List<String> collect = words.stream().filter(n -> n.contentEquals(new StringBuilder(n).reverse())).collect(Collectors.toList());
    System.out.println(collect);
  }
}
