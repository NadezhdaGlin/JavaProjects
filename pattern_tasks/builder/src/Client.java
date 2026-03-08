public class Client {
	public static void main(String[] args) {
	BurgerDirector director = new BurgerDirector();
  ConcreteBurgerBuilder builder = new ConcreteBurgerBuilder();
  
  director.makeCheeseBurger(builder);
  Burger burger = builder.build();
  System.out.println(burger);
	}
}
