public class FibonacciSeries {

  //fibonacci series will be like this..
  //first=0, second=1, max=10
  //0,1,1,2,3,5,8,13
  public static void main(String[] args) {
    int first=0;
    int second=1;
    int max=10;
    int sum=0;
    for(int i=2;i<max;i++){
      sum=first+second;
      System.out.println("sum: "+sum);
      first=second;
      second=sum;


    }

  }
}
