public interface OrderHandler {
  void setNext(OrderHandler handler);
  void handle(Order order);
}
