public class InfinityNumber {
  private static final Object lock = new Object();
  private static boolean printOne = true;

  public static void main(String[] args) {

    Thread t1 = new Thread(() -> {
      while (true) {
        synchronized (lock) {
          while (!printOne) {
            try { lock.wait(); } catch (InterruptedException e) {}
          }
        System.out.print("1 ");
        printOne = false;
        lock.notify();
        }
      }
    });

    Thread t2 = new Thread(() -> {
      while (true) {
        synchronized (lock) {
          while (printOne) {
            try { lock.wait(); } catch (InterruptedException e) {}
          }
        System.out.print("2 ");
        printOne = true;
        lock.notify();
        }
      }
    });
    t1.start();
    t2.start();
  }
}
