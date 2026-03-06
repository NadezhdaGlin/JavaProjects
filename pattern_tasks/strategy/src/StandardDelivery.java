public class StandardDelivery implements DeliveryStrategy {
  public double calculate(Order order) {
    return 5 + order.getTotalWeight() * 1;
  }
}
