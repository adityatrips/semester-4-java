public class App {
  public static void main(String[] args) {
    int dividend = 10;
    int divisor = 0;
    int result;

    try {
      result = dividend / divisor;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Unknown error occurred: " + e.getMessage());
    }
  }
}
