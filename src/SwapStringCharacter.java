public class SwapStringCharacter {

  public static void main(String[] args) {

    String str="HeLPO";
    char[] c=str.toCharArray();
    for(int i=0;i<c.length-1;i+=2){
      char temp=c[i];
      c[i]=c[i+1];
      c[i+1]=temp;
    }
    String st=new String(c);
    System.out.println("scd: "+st);
  }
}
