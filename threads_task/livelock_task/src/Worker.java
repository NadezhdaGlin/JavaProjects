class Worker {
  private boolean active;

  public Worker(boolean active) {
      this.active = active;
  }

  public boolean isActive() {
      return active;
  }

  public void work(Worker worker) {
    while (active) {
      if (worker.isActive()) {
        System.out.println(Thread.currentThread().getName() + " the second stream is coming");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        continue;
      }
      System.out.println(Thread.currentThread().getName() + " works");
      active = false;
    }
  }
}
