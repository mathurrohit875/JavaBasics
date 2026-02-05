package JavaEightLearning;

public class NewMain {
  int x = 20;

  public static void main(String[] args) {
    EmployeeInt employeeInt = () -> {

      return "";
    };
    System.out.println(employeeInt.getSalary());
  }

  private void doSomethig() {

    EmployeeInt employeeInt = () -> {
      int x = 30;
      System.out.println(this.x);
      return "100";
    };
    System.out.println(employeeInt.getSalary());
    EmployeeInt employeeInt2 = new EmployeeInt() {
      final int x = 10;

      @Override
      public String getSalary() {
        System.out.println(this.x);
        return "";
      }
    };
  }
}
