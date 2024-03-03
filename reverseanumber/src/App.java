import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    int num;
    System.out.println("Enter a number to be reversed: ");
    num = in.nextInt();

    int reversed = 0;

    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed number: " + reversed);

    in.close();
  }
}
