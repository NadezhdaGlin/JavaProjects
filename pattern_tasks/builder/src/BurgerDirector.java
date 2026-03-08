public class BurgerDirector {
	public void makeCheeseBurger(BurgerBuilder builder) {
		builder.setBun(Burger.Bun.REGULAR);
		builder.setCutlet(Burger.Cutlet.BEEF);
		builder.setCheese(Burger.Cheese.CHEDDAR);
		builder.setSauce(Burger.Sauce.KETCHUP);
		builder.addVegetable(Burger.Vegetable.TOMATO);
		builder.addVegetable(Burger.Vegetable.LETTUCE);
	}

	public void makeChickenBurger(BurgerBuilder builder) {
		builder.setBun(Burger.Bun.WHOLEGRAIN);
		builder.setCutlet(Burger.Cutlet.CHICKEN);
		builder.setCheese(Burger.Cheese.MOZZARELLA);
		builder.setSauce(Burger.Sauce.MAYONNAISE);
		builder.addVegetable(Burger.Vegetable.LETTUCE);
		builder.addVegetable(Burger.Vegetable.CUCUMBER);
	}
	public void makeVeganBurger(BurgerBuilder builder) {
		builder.setBun(Burger.Bun.WHOLEGRAIN);
		builder.setCutlet(Burger.Cutlet.VEGAN);
		builder.setSauce(Burger.Sauce.BARBECUE);
		builder.addVegetable(Burger.Vegetable.TOMATO);
		builder.addVegetable(Burger.Vegetable.ONION);
		builder.addVegetable(Burger.Vegetable.LETTUCE);
	}
}
