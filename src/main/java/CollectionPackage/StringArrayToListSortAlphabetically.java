package CollectionPackage;

import java.util.Arrays;
import java.util.List;

public class StringArrayToListSortAlphabetically {

  public static void main(String[] args) {
    String[] arr = {"banana", "apple", "mango"};
    List<String> list = Arrays.asList(arr);
    list.sort(null);
    System.out.println(list);

  }
}
