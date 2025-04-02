public class sumWhileLoop {

  public static void main(String[] args) {

    int a=1;
    int sum=1;
    while(a<=10){
      System.out.println("sum first: "+sum);
      System.out.println("value of a: "+a);
      sum+=a;
      System.out.println("sum: "+sum);
      a++;
    }
    System.out.println("a: "+sum);

  }

}

