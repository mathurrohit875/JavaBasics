public class SwapNumberWithoutThirdVariable {

  public static void main(String[] args) {
    int a=50;
    int b=100;

   //a=b;
    System.out.println(a);

    //b=a;
    System.out.println(b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a+" "+b);


  }
}
