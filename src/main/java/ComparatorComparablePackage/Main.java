package ComparatorComparablePackage;

import StudentClassPackage.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<String> {


  @Override
  public int compare(String o1, String o2) {
    return o1.length() - o2.length();
  }
}

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(4);
    list.add(9);
    list.sort(null);
    System.out.println(list);
    List<String> list2 = new ArrayList<>();
    list2.add("Apple");
    list2.add("Guava");
    list2.add("Chiku");
    list2.add("Papaya");
    list2.sort(((o1, o2) -> o2.length() - o1.length()));
    System.out.println(list2);

    List<Students> list3 = new ArrayList<>();
    list3.add(new Students("hlice", 8.2));
    list3.add(new Students("clice", 2.89));
    list3.add(new Students("dlice", 1.56));
    list3.add(new Students("flice", 1.56));
    Comparator<Students> comparator = Comparator.comparing(Students::getGpa).thenComparing(Students::getName);
    list3.sort(comparator);
    /*list3.sort((o1, o2) -> {
     if(o2.getGpa()-o1.getGpa()>0){
       return 1;

     }else if(o2.getGpa()-o1.getGpa()<0){
       return -1;

     }else{
       return 0;
     }
    });*/
    for (Students s : list3) {
      System.out.println(s.getName() + " " + s.getGpa());

    }

  }
}
