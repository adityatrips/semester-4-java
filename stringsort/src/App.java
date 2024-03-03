public class App {
  public static void main(String[] args) throws Exception {
    String names[] = {
        "Chennai",
        "Mumbai",
        "Delhi",
        "Kolkata",
        "Bangalore",
        "Hyderabad",
    };
    int size = names.length;

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (names[i].compareTo(names[j]) > 0) {
          String temp = names[i];
          names[i] = names[j];
          names[j] = temp;
        }
      }
    }
    System.out.println("Sorted array is: ");

    for (int i = 0; i < size; i++) {
      System.out.println(names[i]);
    }
  }
}
