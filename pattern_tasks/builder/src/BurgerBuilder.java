public interface BurgerBuilder {
	void setBun(Burger.Bun bun);
	void setCutlet(Burger.Cutlet cutlet);
	void setCheese(Burger.Cheese cheese);
	void setSauce(Burger.Sauce sauce);
	void addVegetable(Burger.Vegetable vegetable);
	Burger build();
}
