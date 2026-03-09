public class MilkDecorator extends CoffeeDecorator {
  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  public int getCost() {
    return coffee.getCost() + 2;
  }

  public String getDescription() {
    return coffee.getDescription() + ", milk";
  }
}
