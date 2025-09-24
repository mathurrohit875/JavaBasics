package StringPrograms;

public class NumberOfWordsInString {
  public static void main(String[] args){
    String str="Hello World";
    String[] sss=str.trim().split("\\s+");
    System.out.println("number of words in the string: "+sss.length);
  }
}
