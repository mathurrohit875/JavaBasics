package MapPackage;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    String str = "swwiss";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    System.out.println(map.entrySet());
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.get(c) == 1) {
        System.out.println(c + " " + map.get(c));
        break;

      }

    }


  }
}
