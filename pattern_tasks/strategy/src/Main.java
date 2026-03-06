public class Main {
	public static void main(String[] args) {
		Product phone = new Product("Phone", 0.5, 800);
		Product laptop = new Product("Laptop", 2.5, 1500);

		Address address = new Address("Russia", "Moscow", "Srteet1");

		Order order = new Order(address);
		order.addProduct(phone);
		order.addProduct(laptop);

		order.setDeliveryStrategy(new StandardDelivery());
		System.out.println("Standard delivery: " + order.calculateDeliveryCost());

		order.setDeliveryStrategy(new PickupDelivery());
		System.out.println("Pickup delivery: " + order.calculateDeliveryCost());
	}
}
