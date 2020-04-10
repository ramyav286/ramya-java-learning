package classandobjects.constructorpackage;

public class OrderClassWithConstructor {

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;
	
	OrderClassWithConstructor() {
		orderId=23;
		productId=1;
		orderQuantity=5;
		eachProductPrice=12.5;
		tax=0.25;
		deliveryPostalCode="SL38SR";
		orderTimeStamp = "2020-02-02  23:35:25";
	}
		
		public void makeAnOrderMethod() {
		System.out.println("always be positive");
	}
		
		public void cancelAnOrderMethod() {
			System.out.println("have faith in god");}
		
		public void returnAnOrderMethod() {
			System.out.println("self love");
		}
		
		public void calculateTotalOrderPriceMethod() {
			System.out.println(( orderQuantity * eachProductPrice) + tax);
		}
	}


