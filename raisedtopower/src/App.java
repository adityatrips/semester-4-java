import java.util.Scanner;
import static java.lang.Math.pow;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the base number: ");
    double base = in.nextDouble();

    System.out.println("Enter the exponent: ");
    double exponent = in.nextDouble();

    double result = pow(base, exponent);

    System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    in.close();
  }
}
