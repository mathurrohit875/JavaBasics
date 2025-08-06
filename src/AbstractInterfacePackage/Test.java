package AbstractInterfacePackage;

public class Test {
  public static void main(String[] args) {
    String str = "Hello World";
    //StringBuilder rev = new StringBuilder();
    String[] splitStr = str.split(" ");
   /* for (int i = 0; i < splitStr.length; i++) {
      String st = splitStr[i];
    String reversedWord = new StringBuilder(st).reverse().toString();
    rev.append(reversedWord);
    if (i < splitStr.length - 1) {
      rev.append(" ");
    }
  }
    System.out.println("rev " + rev.toString());*/
    // Alternative without method using StringBuilder

    String rever = "";

    for (int i = 0; i < splitStr.length; i++) {
      String st = splitStr[i];
      String reversedWord = "";
      for (int j = st.length() - 1; j >= 0; j--) {
        reversedWord += st.charAt(j);
      }
      rever += reversedWord;
      if (i < splitStr.length - 1) {
        rever += " ";
      }
    }
    System.out.println("rev " + rever);


   /* int[] arr={1,1,0,5,0,0,1};
    int temp = 0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    // Print the sorted array
    System.out.print("Sorted array in descending order: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
StringBuilder sb=new StringBuilder();
*/
  }
}
