package JavaEightLearning;

@FunctionalInterface
public interface ChildInterface extends ParentInterface {

  default void sayBye() {

  }
}
