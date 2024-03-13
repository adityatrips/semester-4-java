package inheritance;

public class Main {
  public static void main(String[] args) throws Exception {
    A a = new A();
    B b = new B();
    C c = new C();
    A r;
    r = b;
    r.callMe();
    r = a;
    r.callMe();
    r = c;
    r.callMe();

    System.out.println("Without inheritance");

    a.callMe();
    b.callMe();
    c.callMe();
  }
}
