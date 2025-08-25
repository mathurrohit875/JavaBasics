package JavaEightDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Ankit", "Mohan", "Ram", "Shyam", "Arun");
    Stream<String> stream = list.stream().filter(x -> x.startsWith("A"));
    long res = list.stream().filter(x -> x.startsWith("A")).count();
    System.out.println(res);


    Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
    list.stream().sorted();

  }
}
