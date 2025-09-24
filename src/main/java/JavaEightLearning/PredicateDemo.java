package JavaEightLearning;

import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) {
    int a = 10;
    Predicate<Integer> predicate = x -> x > 100;
    System.out.println(predicate.test(101));
  }
}
