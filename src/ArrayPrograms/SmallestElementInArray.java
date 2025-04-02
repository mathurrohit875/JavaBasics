package ArrayPrograms;

public class SmallestElementInArray {

  public static void main(String[] args) {
    int[] arr={2,3,12,3,12,3,35,31,53,1,4};
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }

    }
    System.out.println("min: "+min);
  }


}
