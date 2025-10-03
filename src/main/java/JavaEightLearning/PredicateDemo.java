package JavaEightLearning;

import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) {
    int a = 10;
    Predicate<Integer> predicate = x -> x > 100;
    Predicate<Integer> predicate1 = x -> x > 100;
    System.out.println(predicate.test(101));
    System.out.println(predicate.negate().test(1001));
    System.out.println(predicate.or(predicate1).test(80));
    System.out.println(predicate.and(predicate1).test(101));
    System.out.println(predicate1.equals(predicate));
    Student s1 = new Student("Rohit", 1);
    Student s2 = new Student("Rohit", 2);
    Predicate<Student> predicate2 = x -> x.getId() > 1;
    System.out.println(predicate2.test(s2));
    Predicate<Object> predicate3 = Predicate.isEqual("hello");
    System.out.println(predicate3.test("d"));

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


