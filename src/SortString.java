public class SortString {

  public static void main(String[] args) {
    String str = "azbycxd";

    char[] charArray = str.toCharArray();
    System.out.println("charArray.length " + (charArray.length));
    for (int i = 0; i < charArray.length - 1; i++) {
      System.out.println("--------------for 1st start--------------");
      System.out.println("charArray.length-1 " + (charArray.length - 1));
      System.out.println("charArray.length-1-i " + (charArray.length - 1 - i));
      System.out.println("character at " + i + ": " + charArray[i]);
      for (int j = 0; j < charArray.length - 1 - i; j++) {
        System.out.println("--------------for start--------------");
        System.out.println("charArray[j]: " + j + ": " + charArray[j]);
        System.out.println("charArray[j+1]: " + (j + 1) + ": " + charArray[j + 1]);
        if (charArray[j] > charArray[j + 1]) {
          System.out.println("--------------if start--------------");
          char temp = charArray[j];
          System.out.println("temp: " + temp);
          charArray[j] = charArray[j + 1];
          System.out.println("charArray[j]: " + charArray[j]);
          System.out.println("charArray[j+1]: " + charArray[j + 1]);
          System.out.println("charArray[j]=charArray[j+1]: " + (charArray[j] = charArray[j + 1]));
          charArray[j + 1] = temp;
          System.out.println("charArray[j+1]: " + charArray[j + 1]);
          System.out.println("temo: " + temp);
          System.out.println("--------------if end--------------");
          String check = new String(charArray);
          System.out.println("charArray checking: "+check);
        }
        System.out.println("--------------for end--------------");
      }
      System.out.println("--------------for 1st end--------------");
    }
    // Convert the sorted character array back to a string
    String sortedString = new String(charArray);

    System.out.println("Sorted string: " + sortedString);

  }
}
