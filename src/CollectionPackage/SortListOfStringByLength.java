package CollectionPackage;

import java.util.Arrays;
import java.util.List;

public class SortListOfStringByLength {

  public static void main(String[] args) {
    String[] str = {"cat", "elephant", "dog", "hippo"};
    List<String> list = Arrays.asList(str);
    list.sort((o1, o2) -> o1.length() - o2.length());
    System.out.println(list);

  }
}
