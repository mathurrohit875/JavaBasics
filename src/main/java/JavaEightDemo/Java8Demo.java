package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface MathOperation {
  int operate(int a, int b);
}

public class Java8Demo {

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      System.out.println("run");
    });
    MathOperation sumOperat = Integer::sum;
    sumOperat.operate(1, 2);
    Predicate<Integer> predicate = x -> x % 2 == 0;
    System.out.println(predicate.test(5));
    Function<Integer, Integer> fun = a -> 2 * a;
    Function<Integer, Integer> func = a -> 2 * a;
    fun.compose(func).andThen(fun).apply(6);
    System.out.println(fun.andThen(func).apply(6));
    System.out.println(fun.compose(func).apply(6));
    Consumer<Integer> consumer = (x) -> System.out.println(x);
    consumer.accept(5);
    Predicate<Integer> isEven = x -> x % 2 == 0;
    Function<Integer, Integer> function = x -> x * x;
    Consumer<Integer> consumer1 = x -> System.out.println(x);
    Supplier<Integer> supplier = () -> 100;
    if (isEven.test(supplier.get())) {
      consumer1.accept(function.apply(supplier.get()));
    }
    List<String> student = Arrays.asList("ram", "shyam", "gopal");
    student.forEach(x -> System.out.println(x));
    student.forEach(System.out::println);
    List<String> mo = Arrays.asList("A", "B", "C");
    List<Mobile> mobileList = mo.stream().map(Mobile::new).collect(Collectors.toList());
    mobileList.forEach(System.out::println);
  }
}

class Mobile {
  String name;

  public Mobile(String name) {
    this.name = name;
  }
}
