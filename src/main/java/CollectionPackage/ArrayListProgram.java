package CollectionPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/* class MyComparator implements Comparator<Integer>{


   @Override
   public int compare(Integer o1, Integer o2) {
     return o1=o2;
   }
 }*/
public class ArrayListProgram implements Comparator<Integer> {

  public static void main(String[] arg) {

    List<Integer> list = new ArrayList<>(20);
    list.add(5);
    list.add(2);
    list.add(3);
    list.sort(new ArrayListProgram());
    System.out.println(list);
    list.sort(new ArrayListProgram().reversed());
    System.out.println(list);
  }

  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1;
  }

  @Override
  public Comparator<Integer> reversed() {
    return Comparator.super.reversed();
  }
}
