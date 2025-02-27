public class LCMTwoNumbers {

  public static void main(String[] args) {
    int a=35;
    int b=25;
    int ans=(a>b)?a:b;
    System.out.println("ans: "+ans);
    int i=0;
    System.out.println("(a>b)?a:b: "+((a>b)?a:b));
    while(true){
      System.out.println("ans oieuio: "+ans);
      System.out.println("ans%a==0 && ans%b==0 at "+i+" is: "+(ans%a==0 && ans%b==0));
      System.out.println("value of ans at starting at "+i+" is: "+ans);
      System.out.println("ans%a==0: is: "+(ans%a));
      System.out.println("ans%b==0: is: "+(ans%b));
      if(ans%a==0 && ans%b==0){
        System.out.println("checking value of ans: "+ans);
        break;
      }
      i++;
      ans++;
    }
    System.out.println("ans fvdvfv: "+ans);
// Using Euclid's algorithm to find the GCD
    int a1 = a;
    int b1 = b;
    // Calculate GCD using Euclid's algorithm
    while (b1 != 0) {
      int temp = b1;
      b1 = a1 % b1;
      a1 = temp;
    }
    System.out.println("The GCD of " + a + " and " + b + " is: " + a1);

    int vodfiv=Math.abs(a*b)/(a1);
    System.out.println("vsd: "+vodfiv);
  }
}
