package JavaEightDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenaListofLists {

  public static void main(String[] args) {
    List<List<Integer>> list = Arrays.asList(
          Arrays.asList(1, 2),
          Arrays.asList(3, 4),
          List.of(5)
    );

    List<Integer> collect = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
    System.out.println(collect);


  }
}
