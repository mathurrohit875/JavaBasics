package StringPrograms;

public class ReverseString {

  public static void main(String[] args) {
    String str = "hello world";
    //holle wrldo;
    String r = "";
    char c;
    if(str==null || str.equals("")|| str.isEmpty()||str.isBlank()){
      System.out.println("the string is empty");
    }else{
      for (int i = 0; i < str.length(); i++) {

        c = str.charAt(i);
        r = c + r;
        System.out.println("string " + r);

      }
      System.out.println("final string " + r);
    }

    StringBuilder strB = new StringBuilder();
    strB.append(str);
    strB.reverse();

    System.out.println("print strB " + strB);

    String reversed = "";

    String voweles = "";
    for (int i = 0; i < str.length(); i++) {
      char c2 = str.charAt(i);
      if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o') {
        voweles += c2;
      }
    }
    String reversedVowels = "";
    for (int i = voweles.length() - 1; i >= 0; i--) {
      reversedVowels += voweles.charAt(i);

    }
    int vowelesIndex = 0;
    for (int i = 0; i < str.length(); i++) {
      char c1 = str.charAt(i);
      if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o') {
        reversed += reversedVowels.charAt(vowelesIndex);
        vowelesIndex++;

      } else {
        reversed += c1;
      }
    }

    System.out.println(reversed);
  }

}
