package StudentClassPackage;

public class Students implements Comparable<Students> {
  private final String name;
  private final double gpa;

  public Students(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;

  }

  @Override
  public String toString() {
    return "Students{" +
          "name='" + name + '\'' +
          ", gpa=" + gpa +
          '}';
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }


  @Override
  public int compareTo(Students o) {
    return Double.compare(this.gpa, o.getGpa());
  }
}
