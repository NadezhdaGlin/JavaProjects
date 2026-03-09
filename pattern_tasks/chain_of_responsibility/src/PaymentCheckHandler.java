public class PaymentCheckHandler implements OrderHandler {
  private OrderHandler next;

  public void setNext(OrderHandler handler) {
    this.next = handler;
  }

  public void handle(Order order) {
    if (!order.cardValid) {
      System.out.println("Order rejected: card is invalid.");
    } else if (next != null) {
      next.handle(order);
    }
  }
}
