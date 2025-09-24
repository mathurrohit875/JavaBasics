public class EvenOdd {

  public static void main(String[] args) {

    int[] j={2,3,4,5,6,7,8,9,10};
    for(int i=0;i<j.length;i++){
      if(j[i]%2==0){
        System.out.println("even number is: "+j[i]);
      }
      else{
        System.out.println("odd number is: "+j[i]);
      }
    }


  }
}
