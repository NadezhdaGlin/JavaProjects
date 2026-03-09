public class Main {
  public static void main(String[] args) {
    OrderHandler stockCheck = new StockCheckHandler();
    OrderHandler paymentCheck = new PaymentCheckHandler();
    OrderHandler confirmation = new OrderConfirmationHandler();

    stockCheck.setNext(paymentCheck);
    paymentCheck.setNext(confirmation);

    Order order1 = new Order("Laptop", true, true);
    Order order2 = new Order("Smartphone", false, true);
    Order order3 = new Order("Tablet", true, false);

    stockCheck.handle(order1);
    stockCheck.handle(order2);
    stockCheck.handle(order3);
  }
}
