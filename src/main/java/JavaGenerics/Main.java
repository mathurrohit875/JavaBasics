package JavaGenerics;


import java.util.ArrayList;

/*
T: Type
E: Element {used in collection}
K: Key {used in map}
V: Value {used in maps}
N: Number
*/
public class Main {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    Box<Integer> box = new Box<>();
    box.setValue(1);
    int integer = box.getValue();
    System.out.println(integer);

    /*Box<String> box1=new Box<>();
    box1.setValue("hello");
    String str=box1.getValue();
    System.out.println(str);*/

    Pair<String, Integer> pair = new Pair<>("Age", 1);
    System.out.println(pair.getKey() + " : " + pair.getValue());
  }

}
