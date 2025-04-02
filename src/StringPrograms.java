public class StringPrograms {
  public static void main(String[] args){
    String str1=new String("hello");
    String str2=new String("hello");
    String str3="hello";
    String str4="hello";
    System.out.println("str1==str2: "+(str1==str2));
    System.out.println("str3==str4: "+(str3==str4));
    System.out.println("str1.equals(str2): "+str1.equals(str2));
    System.out.println("str3.equals(str4): "+str3.equals(str4));
    StringPrograms s=new StringPrograms();
    System.out.println(s.sum("g ",2));
  }
  public String sum(Object obj1, Object obj2) {
    return obj1.toString() + obj2.toString();
  }

}
