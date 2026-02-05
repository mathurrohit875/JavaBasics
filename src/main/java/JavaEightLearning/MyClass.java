package JavaEightLearning;

interface D {
  static void sayHello() {
    System.out.println("say hello");
  }

  static void main(String[] args) {
    System.out.println("hello from interface");
  }

  static void no() {
    System.out.println("static no");
  }

  default void Fbye() {
    System.out.println("fbye");
  }

  default void yes() {
    System.out.println("yes");
  }
}

class Animal {
  static void sound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {
  static void sound() {
    System.out.println("woof woof");
  }
}

class Cat extends Animal {
  static void sound() {
    System.out.println("meow meow");

  }
}

public class MyClass implements D {
  public static void main(String[] args) {
    D myClass = new MyClass();
    D.sayHello();
    D.no();
    String[] arr = {"hello"};
    D.main(arr);
    myClass.Fbye();
    myClass.yes();
    Animal a = new Dog();
    Animal.sound();
    Animal c = new Cat();
    Animal.sound();
  }
}
