import java.util.ArrayList;
import java.util.List;

public class Burger {
	private List<Vegetable> vegetables = new ArrayList<>();
	private Bun bun;
	private Cutlet cutlet;
	private Sauce sauce;
	private Cheese cheese;

	public enum Vegetable { LETTUCE, TOMATO, CUCUMBER, ONION };
 	public enum Bun { REGULAR, CHEESE, WHOLEGRAIN };
  public enum Cutlet { BEEF, CHICKEN, VEGAN };
  public enum Sauce { KETCHUP, MAYONNAISE, BARBECUE };
	public enum Cheese { CHEDDAR, MOZZARELLA };

	void setBun(Bun bun) {
    this.bun = bun;
  }

  void setCutlet(Cutlet cutlet) {
    this.cutlet = cutlet;
  }

  void setCheese(Cheese cheese) {
    this.cheese = cheese;
  }

  void setSauce(Sauce sauce) {
    this.sauce = sauce;
  }

  void addVegetable(Vegetable vegetable) {
    vegetables.add(vegetable);
  }
	
	public String toString() {
	  return "Burger{" +
	  "bun=" + bun +
	  ", cutlet=" + cutlet +
	  ", cheese=" + cheese +
	  ", sauce=" + sauce +
	  ", vegetables=" + vegetables +
	  '}';
	}
}
