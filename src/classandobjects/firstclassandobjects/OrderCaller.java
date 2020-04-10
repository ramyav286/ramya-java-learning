package classandobjects.firstclassandobjects;

public class OrderCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is first object of order class");
		
		Order orderObj1 = new Order ();
		
		System.out.println(orderObj1.productId);
		System.out.println(orderObj1.orderQuantity);
		System.out.println(orderObj1.eachProductPrice);
		System.out.println(orderObj1.tax);
        System.out.println(orderObj1.deliveryPostalCode);
        
        orderObj1.makeAnOrderMethod();
        orderObj1.cancelAnOrderMethod();
        orderObj1.calculateTotalOrderPriceMethod();
        
        Order orderObj2= new Order();
        System.out.println(orderObj2.productId);
		System.out.println(orderObj2.orderQuantity);
		System.out.println(orderObj2.eachProductPrice);
		System.out.println(orderObj2.tax);
        System.out.println(orderObj2.deliveryPostalCode);
        
        orderObj2.makeAnOrderMethod();
        orderObj2.cancelAnOrderMethod();
        orderObj2.calculateTotalOrderPriceMethod();
        
	}

}
