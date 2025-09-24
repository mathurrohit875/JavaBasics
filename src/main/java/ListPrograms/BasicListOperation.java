package ListPrograms;

import java.util.ArrayList;
import java.util.List;

public class BasicListOperation {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    System.out.println("list: " + list.get(0));
    //print all list
    for (String s : list) {
      System.out.println("list: " + s);
    }
    for (String animal : list) {
      System.out.println(animal);
    }


  }
}
