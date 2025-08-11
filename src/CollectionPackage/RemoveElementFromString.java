package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromString {

  public static void main(String[] args) {
    String[] str = {"apple", null, "banana", null, "cherry"};
    List<String> list = new ArrayList<>(Arrays.asList(str));
    //list.remove(2);
    //System.out.println(list);
    // list.removeIf(n->list.size()<3);
    //System.out.println(list);
    list.removeIf(n -> n == null);
    System.out.println(list);
    /*for(int i=0;i<str.length;i++){
      String a=str[i];
      System.out.println("a: "+a );
      if(!(a ==null)){
        list.add(a);
      }

    }*/
    System.out.println(list);


  }
}
