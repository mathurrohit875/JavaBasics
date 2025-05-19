package StringPrograms;

import java.util.HashSet;

public class RepeatedWordInString {

  public static void main(String[] args) {

    String str = "hello world hello world hello world ";

    String[] rep = str.split(" ");
    HashSet<String> printedWords = new HashSet<>();

    for (int i = 0; i < rep.length; i++) {
      int count = 0;
      for (int j = 0; j < i; j++) {
        if (rep[i].equalsIgnoreCase(rep[j]) && !printedWords.contains(rep[i].toLowerCase())) {
          count++;
          System.out.println("repeat word: " + rep[i]);
          printedWords.add(rep[i].toLowerCase());
          System.out.println("count: " + count);
          break;
        }


      }

    }

  }
}
