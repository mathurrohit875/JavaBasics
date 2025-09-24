package PracticeProject;

public record StudentEnrollment(String courseName, int grade) {

}

  /*private String courseName;
  private int grade;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StudentEnrollment that = (StudentEnrollment) o;
    return grade == that.grade && Objects.equals(courseName, that.courseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseName, grade);
  }

  public StudentEnrollment(String courseName, int grade) {
    this.courseName = courseName;
    this.grade = grade;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "StudentEnrollment{" +
          "courseName='" + courseName + '\'' +
          ", grade=" + grade +
          '}';
  }*/

