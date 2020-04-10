package classandobjects.firstclassandobjects;

public class Order {

	int productId = 1;
	int orderQuantity=3;
	double eachProductPrice = 12.5;
	double tax=0.25;
	String deliveryPostalCode = "SL38SR";
	
	public void makeAnOrderMethod () {
		System.out.println("always be positive");
	}
	
	public void cancelAnOrderMethod () {
		System.out.println("have faith in god");
	}
	public void returnAnOrderMethod () {
		System.out.println("self love");
	}
	public void calculateTotalOrderPriceMethod () {
		System.out.println((orderQuantity* eachProductPrice)+tax);
	}

}

