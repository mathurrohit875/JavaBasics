package JavaEightLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodConstructor {

  public static void print(String s) {
    System.out.println(s);

  }

  public static void main(String[] args) {
    MethodConstructor methodConstructor = new MethodConstructor();
    List<String> students = Arrays.asList("hhe", "ou");
    // students.forEach(x-> System.out.println(x));
    students.forEach(MethodConstructor::print);
    students.forEach(methodConstructor::newPrint);
    List<StudentClass> collect = students.stream().map(StudentClass::new).collect(Collectors.toList());
    System.out.println(collect);
  }

  public void newPrint(String s) {
    System.out.println(s);
  }
}
