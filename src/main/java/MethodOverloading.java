public class MethodOverloading {

  public static void main(String[] args){
    MethodOverloading m=new MethodOverloading();
    System.out.println("sum value: "+m.sum(1,2));
    System.out.println("sum 3 value: "+m.sum(5,2,3));
    System.out.println("sum string: "+m.sum("2","3"));
  }


  public int sum(int a,int b){
    return a+b;
  }

  public int sum(int c,int d, int e ){
    return c+d-e;
  }

  public String sum(String str, String str1){
    return str+str1;
  }
}
