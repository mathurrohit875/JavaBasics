package JavaEightLearning;

public class MyClassThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("value of i: " + i);

    }
  }
}
