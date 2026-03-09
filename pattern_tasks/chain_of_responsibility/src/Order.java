public class Order {
  String item;
  boolean inStock;
  boolean cardValid;

  public Order(String item, boolean inStock, boolean cardValid) {
    this.item = item;
    this.inStock = inStock;
    this.cardValid = cardValid;
  }
}
