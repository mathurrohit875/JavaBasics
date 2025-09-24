package ArrayPrograms;

public class OddEvenInArray {

  public static void main(String[] args){
    int[] arr={2,3,5,62,1,24,7,8};
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        System.out.println("this is even number: "+arr[i]);
      }
      else{
        System.out.println("this is odd number: "+arr[i]);
      }

    }

  }
}
