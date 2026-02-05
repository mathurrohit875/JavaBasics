package JavaEightLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {
    Function<String, Integer> function = x -> x.length();
    System.out.println(function.apply("hello"));
    Function<String, Boolean> function1 = x -> x.startsWith("a");
    System.out.println(function1.apply("aello"));


    Function<String, String> function2 = x -> x.substring(0, 3);
    Function<List<Student>, List<Student>> function3 = li -> {
      List<Student> result = new ArrayList<>();
      for (Student s : li) {
        String first3 = function2.apply(s.getName());
        if (first3.equalsIgnoreCase("vip")) {
          result.add(s);
        }
      }
      return result;
    };
    Student s1 = new Student("hello", 1);
    Student s2 = new Student("vip", 2);
    Student s3 = new Student("pla", 3);
    List<Student> list = Arrays.asList(s1, s2, s3);
    List<Student> filterS = function3.apply(list);
    System.out.println(filterS);

    Function<String, String> function4 = s -> s.toUpperCase();
    Function<String, String> function5 = s -> s.substring(0, 3);
    System.out.println(function4.andThen(function5).apply("rohit"));

    Function<String, String> identity = Function.identity();
    System.out.println("dcd " + identity.apply("hello"));

  }

  private static class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
      this.name = name;
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return "Student{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
  }
}
