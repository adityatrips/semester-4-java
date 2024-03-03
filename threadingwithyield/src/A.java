class A extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      if (i == 3) {
        Thread.yield();
      }
      System.out.println("A: " + i);
    }
  }
}