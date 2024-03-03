public class App {
  public static void main(String[] args) {
    ClassA a = new ClassA();
    ClassB b = new ClassB();
    ClassC c = new ClassC();
    ClassA ref = new ClassA();

    a.callMe();
    b.callMe();
    c.callMe();

    ref = b;

    ref.callMe();
  }
}