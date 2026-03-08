public class ConcreteBurgerBuilder implements BurgerBuilder {
	private Burger burger = new Burger();

  public void setBun(Burger.Bun bun) {
    burger.setBun(bun);
  }

  public void setCutlet(Burger.Cutlet cutlet) {
  	burger.setCutlet(cutlet);
  }

  public void setCheese(Burger.Cheese cheese) {
    burger.setCheese(cheese);
  }

  public void setSauce(Burger.Sauce sauce) {
    burger.setSauce(sauce);
  }

  public void addVegetable(Burger.Vegetable vegetable) {
    burger.addVegetable(vegetable);
  }

  public Burger build() {
    return burger;
  }
}
