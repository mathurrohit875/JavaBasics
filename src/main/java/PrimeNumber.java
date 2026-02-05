import java.util.ArrayList;

public class PrimeNumber {

  public static void main(String[] args) {
    int num1=20;
ArrayList<Integer> s=new ArrayList<>();
    for(int i=2;i<=num1;i++){
      boolean prime=true;
      System.out.println("i at beginning: "+i);
      System.out.println("Math.sqrt(num1): "+Math.sqrt(i));
      for(int j=2;j<=Math.sqrt(i);j++){
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("i%j: "+(i%j));
        if(i%j==0){
          prime=false;
          break;
        }
      }
      if(prime){
        s.add(i);
        System.out.println("Prime num "+i);

      }
    }
    for (Integer integer : s) {
      System.out.println("get all prime number: " + integer);
    }


  }
}
