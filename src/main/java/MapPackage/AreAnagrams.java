package MapPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AreAnagrams {

  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for (int i = 0; i < str1.length(); i++) {
      map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
    }
    for (int j = 0; j < str2.length(); j++) {
      map2.put(str2.charAt(j), map2.getOrDefault(str2.charAt(j), 0) + 1);
    }
    System.out.println(map1.entrySet());
    System.out.println(map2.entrySet());
    boolean b = map1.equals(map2);
    System.out.println(b);
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    for (int i = 0; i < str1.length(); i++) {
      list1.add(String.valueOf(str1.charAt(i)));

    }
    Collections.sort(list1);
    System.out.println(list1);
    for (int i = 0; i < str2.length(); i++) {

      list2.add(String.valueOf(str2.charAt(i)));

    }


    Collections.sort(list2);
    System.out.println(list2);
    boolean lis = list1.equals(list2);
    System.out.println(lis);

  }
}
