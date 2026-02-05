package JavaEightDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListofStringstoUppercase {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Hello", "ram", "shyam");
    List<String> upperCaseList = new ArrayList<>();
    List<String> collect = list.stream()
          .map(s -> s.toUpperCase())
          .collect(Collectors.toList());
    System.out.println(collect);
    for (int i = 0; i < list.size(); i++) {
      upperCaseList.add(list.get(i).toUpperCase());
    }
    System.out.println(upperCaseList);
  }
}
