package PracticeProject;

public record Student(String name, int ID) {
  /*private String name;
  private int ID;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return ID == student.ID && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ID);
  }

  public Student(String name, int ID) {
    this.name = name;
    this.ID = ID;
  }

  @Override
  public String toString() {
    return "Student{" +
          "name='" + name + '\'' +
          ", ID=" + ID +
          '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

*/
}
