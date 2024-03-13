package threadywithyield;

class B extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        B.yield();
        System.out.println("A: " + i);
      }
    }
  }
}