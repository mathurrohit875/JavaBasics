import java.util.*;
import java.util.stream.Collectors;

public class PracticeCoreJava {

  public static void main(String[] args) {

    String str = "maadaam";
    boolean pal = true;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        pal = false;
        break;
      }

    }
    if (pal) {
      System.out.println("true");
    }

    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    System.out.println(sb);
    if (str.contentEquals(sb)) {
      System.out.println("pal");
    }

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }
    for (Map.Entry<Character, Integer> mm : map.entrySet()) {
      System.out.println(mm.getKey() + ": " + mm.getValue());
    }
    char[] c = {'a', 'b', 'c', 'a', 'b', 'c'};
    while (map.containsKey('c')) {
      System.out.println("hello");

    }
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      if (!list.contains(str.charAt(i))) {
        list.add(str.charAt(i));
      }
    }
    System.out.println(list);
    String dup = "";
    for (int i = 0; i < list.size(); i++) {
      dup += list.get(i);
    }
    System.out.println(dup);
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("he");
    list2.add("hu");
    list2.add("he");
    List<String> list3 = new ArrayList<>();
    for (int i = 0; i < list2.size(); i++) {
      if (!list3.contains(list2.get(i))) {
        list3.add(list2.get(i));
      }
    }
    System.out.println(list3);
    String[] str1 = {"hfd", "cdc", "Cd", "xasxs"};
    List<String> list4 = new LinkedList<>();
    list4.add("oaiu");
    list4.add(1, "acsc");
    System.out.println(list4);
    ArrayList<Integer> list5 = new ArrayList<>();
    list5.add(1);
    list5.add(2);
    list5.add(3);
    list5.add(4);
    Iterator<Integer> iterator = list5.iterator();
    String check = "Hello World";
    String result = Arrays.stream(check.split(" "))
          .map(word -> new StringBuilder(word).reverse().toString())
          .collect(Collectors.joining(" "));
    System.out.println(result);


    String stre = "hello world";
    String[] r = stre.split(" ");
    String rev = "";
    for (int i = 0; i < stre.length(); i++) {
      char c1 = stre.charAt(i);
      rev = c1 + rev;

    }
    System.out.println(rev);

  }


}
