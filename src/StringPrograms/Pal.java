package StringPrograms;

public class Pal {

  public static void main(String[] args){
    String str="acdbgb";
    String rev = "";
    for(int i=str.length()-1;i>=0;i--) {
      rev+=str.charAt(i);
    }
    System.out.println("reverse string: "+rev);
  }
}
