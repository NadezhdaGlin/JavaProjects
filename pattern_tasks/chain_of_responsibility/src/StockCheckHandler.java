public class StockCheckHandler implements OrderHandler {
  private OrderHandler next;

  public void setNext(OrderHandler handler) {
    this.next = handler;
  }

  public void handle(Order order) {
    if (!order.inStock) {
        System.out.println("Order rejected: product " + "(" + order.item + ")" + " is out of stock.");
    } else if (next != null) {
        next.handle(order);
    }
  }
}
