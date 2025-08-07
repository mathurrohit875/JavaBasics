package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromString {

  public static void main(String[] args) {
    String[] str = {"Delhi", "Mumbai", "Chennai", "Kolkata"};
    List<String> list = new ArrayList<>(Arrays.asList(str));
    list.remove(2);
    System.out.println(list);


  }
}
