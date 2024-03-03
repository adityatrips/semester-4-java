public class App {
  public static void main(String[] args) throws Exception {
    Rectangle rect = new Rectangle();
    Circle cir = new Circle();

    float arRect = rect.compute(3, 4);
    float arCir = cir.compute(3, 0);

    System.out.println("Area of rectangle: " + arRect);
    System.out.println("Area of circle: " + arCir);
  }
}
