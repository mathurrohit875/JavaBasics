package ComparatorComparablePackage;

import StudentClassPackage.Students;

import java.util.ArrayList;
import java.util.List;


public class ComparableDemo {

  public static void main(String[] args) {
    List<Students> list = new ArrayList<>();
    list.add(new Students("ram", 55));
    list.add(new Students("shar", 33));
    list.add(new Students("ali", 99));
    list.add(new Students("rohit", 44));
    list.add(new Students("akr", 22));
    list.sort(null);
    System.out.println(list);
  }


}
