import java.util.ArrayList;
import java.util.List;

public class Order{
	private List<Product> products;
	private Address address;
	private DeliveryStrategy delivery_strategy;

	public Order(Address address) {
		this.address = address;
		this.products = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void setDeliveryStrategy(DeliveryStrategy delivery_strategy) {
		this.delivery_strategy = delivery_strategy;
	}

	public double calculateDeliveryCost() {
		return delivery_strategy.calculate(this);
	}

	public double getTotalWeight() {
		double total = 0;
		for (Product product : products) {
      total += product.getWeight();
    }
    return total;
  }

  public List<Product> getProducts() {
  	return products;
  }

  public Address getAddress() {
  	return address;
  }
}
