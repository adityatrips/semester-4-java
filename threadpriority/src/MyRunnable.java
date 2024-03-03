class MyRunnable implements Runnable {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName() + " - " + String.format("%2d", i));
    }
  }
}