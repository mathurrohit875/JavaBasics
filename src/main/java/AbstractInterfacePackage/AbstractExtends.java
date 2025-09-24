package AbstractInterfacePackage;

public class AbstractExtends extends AbstractClass{

  @Override
  public void hello() {
    System.out.println("hello from extends");
  }

  @Override
  void hi() {
    super.hi();
  }
  public static void main(String[] args){
    AbstractClass abstractClass=new AbstractExtends();
    abstractClass.hello();
    abstractClass.hi();
  }
}
