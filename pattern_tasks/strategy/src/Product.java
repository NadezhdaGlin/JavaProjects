public class Product {
	private String name;
	private double weight;
	private double price;

	public Product(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}
}
