public class LiveLock {
  public static void main(String[] args) {
    Worker w1 = new Worker(true);
    Worker w2 = new Worker(true);

    new Thread(() -> w1.work(w2), "Thread-1").start();
    new Thread(() -> w2.work(w1), "Thread-2").start();
  }
}
