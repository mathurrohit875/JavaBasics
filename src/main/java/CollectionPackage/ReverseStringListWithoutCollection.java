package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringListWithoutCollection {

  public static void main(String[] args) {
    String[] str = {"one", "two", "three"};
    List<String> list = new ArrayList<>();


    for (int i = str.length - 1; i >= 0; i--) {
      list.add(str[i]);
    }
    System.out.println(list);

  }
}
