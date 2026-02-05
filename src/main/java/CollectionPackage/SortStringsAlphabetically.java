package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringsAlphabetically {
  public static void main(String[] args) {
    String[] str = {"banana", "apple", "cherry"};
    List<String> list = new ArrayList<>(Arrays.asList(str));
    list.add("cho");
    Collections.sort(list);
    System.out.println(list);
  }
}
