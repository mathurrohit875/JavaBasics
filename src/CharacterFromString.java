import org.w3c.dom.ls.LSOutput;

public class CharacterFromString {

  public static void main(String[] args) {
    String str="hello";
    char[] charArray = new char[str.length()];
    for(int i=0;i<str.length();i++){
      charArray[i]=str.charAt(i);

    }
    // Retrieving the character at the given index
    char character = charArray[4];

    // Displaying the result
    System.out.println("Character at index " + 4 + ": " + character);

    // Get the specific character
    char ch = str.charAt(4);

    System.out.println("Character from " + str
          + " at index " + 4
          + " is " + ch);
  }



}
