package JavaEightPracticeInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Problem:
Map each word in a list to its length.
Input:
List<String> words = Arrays.asList("cat", "horse", "dog");
Expected Output:
{cat=3, horse=5, dog=3}

 */
public class CreateMapofWordandItsLength {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("cat", "horse", "dog");
    Map<String, Integer> collect = words
          .stream()
          .collect(Collectors.toMap(w -> w, w -> w.length()));

    System.out.println(collect);
  }
}
