package ArrayPrograms;

public class FrequencyOfEachElementArray {

  public static void main(String[] args){
    int[] arr={2,3,2,2,1,1,2,1};

    for(int i=0;i<arr.length;i++){
      System.out.println("check i value at starting: "+i);
      boolean freq=false;
      for(int k=0;k<i;k++){
        System.out.println("check k value: "+k);
        System.out.println("check i value: "+i);
        System.out.println("check arr[i]: "+arr[i]);
        System.out.println("check arr[k]: "+arr[k]);
        if(arr[i]==arr[k]){
          freq=true;
          break;
        }
      }
      if(freq){
        System.out.println("checking for continue");
        continue;
      }
      int count=0;
      for(int j=0;j<arr.length;j++){
        System.out.println("check j value: "+j);
        System.out.println("check arr[i]: "+arr[i]);
        System.out.println("check arr[j]: "+arr[j]);
        if(arr[i]==arr[j]){
          count++;
          System.out.println("check value of count: "+count);
        }
      }
      System.out.println("frequency: "+arr[i]+" count: "+count);

    }


  }
}
