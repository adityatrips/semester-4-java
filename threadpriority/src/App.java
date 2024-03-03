public class App {
  public static void main(String[] args) throws Exception {
    Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
    Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
    Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.NORM_PRIORITY);
    thread3.setPriority(Thread.MIN_PRIORITY);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
