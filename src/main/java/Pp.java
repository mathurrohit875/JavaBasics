import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pp {

  public static void main(String[] args) throws IOException {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 0, 3, 0, 0, 5, 0, 0, 6));
    List<Integer> nonZeros = list
          .stream()
          .filter(n -> n != 0)
          .collect(Collectors.toList());
    System.out.println(nonZeros);
    long zeroCount = list
          .stream()
          .filter(n -> n == 0)
          .count();
    System.out.println(zeroCount);
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < zeroCount; i++) {
      result.add(0);
    }
    result.addAll(nonZeros);

    System.out.println(result);
    int[] arr = {1, 2, 12, 321, 124, 1, 2, 12, 2};
    List<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 12, 321, 124, 1, 2, 12, 2));
    Map<Integer, Long> collect = arrList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    System.out.println(collect.entrySet());

    String str = "aabbbccccddddd";
    StringBuilder resultbuilder = new StringBuilder();

    int count = 1;
    for (int i = 1; i <= str.length(); i++) {
      if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        resultbuilder.append(String.valueOf(str.charAt(i - 1)).repeat(count));
        resultbuilder.append(count);
        count = 1;
      }
    }
    System.out.println("Output: " + resultbuilder);

    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
    }
    for (Map.Entry<Character, Integer> hmm : hm.entrySet()) {
      System.out.println(hmm.getKey() + ": " + hmm.getValue());
    }

    String strreverse = "abce";
    StringBuilder sb = new StringBuilder(strreverse);
    sb.reverse();
    System.out.println(sb);
    List<String> listString = new ArrayList<>();
    for (int i = 0; i < strreverse.length(); i++) {
      listString.add(String.valueOf(strreverse.charAt(i)));
    }
    System.out.println(listString);
    Collections.reverse(listString);
    System.out.println("" + listString);
    String rev = String.join("", listString);
    System.out.println(rev);


    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    integerList.add(4);

    Object[] array = integerList.toArray(new Integer[0]);
    int length = array.length;
    System.out.println(length);

    int[] arrrev = {1, 2, 3, 4, 5, 6};
    List<Integer> listre = new ArrayList<>();
    for (int i : arrrev) {
      listre.add(i);
    }
    listre.sort((a, b) -> b - a);
    System.out.println(listre);
    listre.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    System.out.println(listre);
    int[] a = new int[arrrev.length];
    for (int i = 0; i < arrrev.length; i++) {
      a[i] = arrrev[arrrev.length - 1 - i];
      System.out.println(a[i]);
    }

    String[] revString = {"a", "b", "c", "d"};
    String[] re = new String[revString.length];
    for (int i = 0; i < revString.length; i++) {
      re[i] = revString[revString.length - 1 - i];
      System.out.println(re[i]);
    }
    List<String> revList = new ArrayList<>(Arrays.asList(revString));
    IntStream.range(0, revList.size())
          .mapToObj(i -> revList.get(revList.size() - 1 - i)).toList();
    System.out.println(revList);
    Collections.reverse(revList);
    System.out.println(revList);
    List<String> collect1 = revList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(collect1);

    int[] dupArr = {1, 2, 3, 4, 2, 4, 1};
    List<Integer> dupLi = new ArrayList<>();
    HashSet<Integer> ha = new HashSet<>();
    for (int i : dupArr) {
      dupLi.add(i);
      ha.add(i);
    }
    List<Integer> collect2 = dupLi.stream().distinct().collect(Collectors.toList());
    System.out.println(collect2);
    System.out.println(ha);
    String[] dupStr = {"a", "b", "a", "b"};
    List<String> duSt = new ArrayList<>(Arrays.asList(dupStr));
    List<String> collect3 = duSt.stream().distinct().collect(Collectors.toList());
    System.out.println(collect3);
    HashSet<String> hs = new HashSet<>(Arrays.asList(dupStr));
    System.out.println(hs);

    int[] high = {1, 8, 2, 3, 4, 5, 6, 7};
    List<Integer> listIn = new ArrayList<>();
    for (int i : high) {
      listIn.add(i);
    }
    listIn.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
    List<Integer> collect4 = listIn.stream().sorted(Comparator.comparing(Integer::intValue)).skip(1).limit(1).collect(Collectors.toList());
    List<Integer> collect5 = listIn.stream().sorted((v, b) -> b - v).skip(1).limit(1).collect(Collectors.toList());
    System.out.println(collect4);
    System.out.println(collect5);
    int mi = Integer.MIN_VALUE;
    int ma = Integer.MAX_VALUE;
    for (int i = 0; i < high.length; i++) {
      if (high[i] > mi) {
        mi = high[i];
      }
    }
    System.out.println(mi);
    int[] arroC = {1, 2, 3, 1, 2, 3, 4, 5};
    List<Integer> listoc = new ArrayList<>();
    for (int i : arroC) {
      listoc.add(i);
    }
    Map<Integer, Long> collect6 = listoc.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    System.out.println(collect6);
    String strch = "abcdec";
    List<Character> listS = new ArrayList<>();
    for (int i = 0; i < strch.length(); i++) {
      listS.add(strch.charAt(i));
    }
    Map<Character, Long> collect7 = listS.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    System.out.println(collect7);
    List<Character> collect8 = listS.stream().distinct().collect(Collectors.toList());
    System.out.println(collect8);
    String strpal = "aamlllba";
    boolean b = IntStream.range(0, strpal.length() / 2).allMatch(i -> strpal.charAt(i) == strpal.charAt(strpal.length() - 1 - i));
    System.out.println(b);
    String rs = Arrays.stream(strpal.split("")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining());
    System.out.println(rs);
    String reverseSt = "abcd";
    Stream<String> stream = Arrays.stream(reverseSt.split(""));
    String collect9 = stream.sorted(Comparator.reverseOrder()).collect(Collectors.joining(""));
    System.out.println(collect9);

    int[] soAr = {1, 0, 5, 1, 0, 5, 1, 0};
    int temp;
    for (int i = 0; i < soAr.length; i++) {
      for (int j = 0; j < soAr.length; j++) {
        if (soAr[i] > soAr[j]) {
          temp = soAr[i];
          soAr[i] = soAr[j];
          soAr[j] = temp;
        }

      }
    }
    for (int i = 0; i < soAr.length; i++) {
      System.out.println(soAr[i]);
    }
    List<Integer> soList = new ArrayList<>();
    for (int i : soAr) {
      soList.add(i);
    }
    List<Integer> collect10 = soList.stream().sorted((d, e) -> e - d).collect(Collectors.toList());
    System.out.println(collect10);

    String ab = "aaabbbcccddd";
    char c;
    List<Character> l = new ArrayList<>();
    for (int i = 0; i < ab.length(); i++) {
      c = ab.charAt(i);
      l.add(c);
    }
    System.out.println(l);
    HashMap<Character, Integer> hmm = new HashMap<>();
    for (int i = 0; i < l.size(); i++) {
      hmm.put(l.get(i), hmm.getOrDefault(l.get(i), 0) + 1);
    }
    for (Map.Entry<Character, Integer> m : hmm.entrySet()) {
      System.out.print(m.getKey() + "" + m.getValue());

    }
    StringBuilder stringBuilder = new StringBuilder();
  }
}
