public class SugarDecorator extends CoffeeDecorator {
  public SugarDecorator(Coffee coffee) {
    super(coffee);
  }

  public int getCost() {
    return coffee.getCost() + 1;
  }

  public String getDescription() {
    return coffee.getDescription() + ", sugar";
  }
}
