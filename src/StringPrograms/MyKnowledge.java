package StringPrograms;

public class MyKnowledge {

  public static void main(String[] args) {
    /*remove the duplicate characters from the string.*/
    String str = "hello";
    String r = "";
    char c = ' ';
    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      boolean found = false;
      for (int j = 0; j < i; j++) {
        if (str.charAt(i) == str.charAt(j)) {
          found = true;
          break;
        }
      }
      if (!found) {
        r += c;
      }
    }

    /*reverse string*/
    System.out.println("repeated char: " + r);
    String st = "Word";
    String s = "";
    char a;
    for (int k = 0; k < st.length(); k++) {
      a = st.charAt(k);
      s = a + s;
    }
    System.out.println("reverse: " + s);

    /*reverse number array*/
    int[] arr = {1, 2, 3};
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - 1 - i];
      System.out.println("reverse array: " + newArr[i]);
    }

    /*duplicate number in array*/
    int[] orrArr = {1, 2, 1, 12, 3, 2};
    for (int i = 0; i < orrArr.length - 1; i++) {
      for (int j = (i + 1); j < orrArr.length; j++) {
        if (orrArr[i] == orrArr[j]) {
          System.out.println("repeated array number: " + orrArr[i]);
        }
      }
    }
  }


}
