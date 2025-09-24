package JavaEightLearning;

public class Main {

  public static void main(String[] args) {
    //MyClassThread myClassThread=new MyClassThread();
    Runnable runnable = () -> {
    };
    for (int i = 0; i < 5; i++) {
      System.out.println("value of I: " + i);

    }
    Thread thread = new Thread(runnable);
    thread.run();
    for (int i = 0; i < 5; i++) {
      System.out.println("inner value: " + i);
    }
    System.out.println(thread.getState());

  }
}
