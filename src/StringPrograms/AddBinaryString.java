package StringPrograms;

public class AddBinaryString {

  public static void main(String[] args){

    int s=Integer.parseInt("100",2);
    int x=Integer.parseInt("011",2);
    int sum=s+x;
    String str=Integer.toBinaryString(sum);
    System.out.println("check: "+str);


  }


}
