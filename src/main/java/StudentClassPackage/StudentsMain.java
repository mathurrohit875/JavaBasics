package StudentClassPackage;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {
  public static void main(String[] args) {
    List<Students> students = new ArrayList<>();
    students.add(new Students("hello", 2.2));
    students.add(new Students("Alice", 3.2));
    students.add(new Students("Mike", 1.2));
    students.add(new Students("Like", 3.9));
    students.sort((a, b) -> {
      if (b.getGpa() - a.getGpa() > 0) {
        return 1;

      } else if (b.getGpa() - a.getGpa() < 0) {
        return -1;

      } else {
        return 0;
      }
    });
    for (Students st : students) {
      System.out.println(st.getName() + " " + st.getGpa());
    }


  }
}
