class OrderConfirmationHandler implements OrderHandler {
  private OrderHandler next;

  public void setNext(OrderHandler handler) {
    this.next = handler;
  }

  public void handle(Order order) {
    System.out.println("Order confirmed: " + order.item);
  }
}
