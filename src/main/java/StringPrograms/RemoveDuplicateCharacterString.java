package StringPrograms;

import java.util.HashSet;

public class RemoveDuplicateCharacterString {


  public static void main(String[] args) {

    String str = "hlelolole";
    char c;
    String r = "";
    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      //r=c+r;
      boolean found = false;
      for (int j = 0; j < i; j++) {
        if (str.charAt(j) == c) {
          found = true;
          break;
        }
      }
      if (!found) {
        r += c;
      }
    }
    System.out.println("resul: " + r);
    //System.out.println("final string "+r);
    StringBuilder sb = new StringBuilder();
    HashSet<Character> seen = new HashSet<>();
    for (char d : str.toCharArray()) {
      if (!seen.contains(d)) {
        seen.add(d);
        sb.append(d);
      }
    }
    System.out.println("print: " + sb);
  }
}

