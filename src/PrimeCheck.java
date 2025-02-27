public class PrimeCheck {

  public static void main(String[] args) {
    int num=20;

    for(int i=2;i<=num;i++){
      boolean prime=true;
      System.out.println("value of i: "+i);
      for(int j=2;j<i;j++){
        System.out.println("value of j: "+j);
        System.out.println("value of i%j: "+(i%j));
      if(i%j==0){
        prime=false;
        break;
      }
      }
      if(prime) {
        System.out.println("this is prime: "+i);
      }
    }

    int num1 = 29;
    boolean isPrime = true;

    if (num1 <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(num1); i++) {
        if (num1 % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    System.out.println(num1 + " is prime? " + isPrime);
  }
}
