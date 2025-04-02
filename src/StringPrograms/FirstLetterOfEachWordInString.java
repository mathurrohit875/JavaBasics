package StringPrograms;

public class FirstLetterOfEachWordInString {

  public static void main(String[] args){
    String str="hello world fb fdbf jy kyj se iud wehhd fdh saw asw";
    String[] newS=str.split(" ");
    for(int i=0;i<newS.length;i++){
      //System.out.println("newS "+newS[i]);
      String st= newS[i];
      System.out.println("st: "+st);
      System.out.println(st.charAt(0));
    }

  }
}
