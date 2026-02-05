package JavaEightLearning;

@FunctionalInterface
interface A {

  static void color() {
    System.out.println("A color");
  }

  default void sayHello() {
    System.out.println("A hello");
  }

  void run();

}


interface B extends A {

  static void color() {
    System.out.println("B color");
  }

  default void sayHello() {
    System.out.println("B hello");
  }

  void run();
}

interface C extends A {

  static void color() {
    System.out.println("C color");
  }

  default void sayHello() {
    System.out.println("C hello");
  }

  void run();
}

public class FunctionalInterfaceClass implements A, B, C {

  public static void main(String[] args) {
    A a = new FunctionalInterfaceClass();
    a.sayHello();
    a.run();
    A.color();
    B.color();
    C.color();


  }


  @Override
  public void sayHello() {
    B.super.sayHello();
  }

  @Override
  public void run() {
    System.out.println("class run");
  }
}
