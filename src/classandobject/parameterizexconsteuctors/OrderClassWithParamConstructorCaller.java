package classandobject.parameterizexconsteuctors;


public class OrderClassWithParamConstructorCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderClassWithParamConstructor obj1 = new OrderClassWithParamConstructor(1, 12, 10, 3.5, 0.25, "SL38SR",
				"2020-03-01 03:34:21");
		System.out.println(obj1.orderId);
		System.out.println(obj1.productId);
		System.out.println(obj1.orderQuantity);
		System.out.println(obj1.eachProductPrice);
		System.out.println(obj1.tax);
		System.out.println(obj1.deliveryPostalCode);
		System.out.println(obj1.orderTimeStamp);
		
		OrderClassWithParamConstructor obj2 = new OrderClassWithParamConstructor(2, 122, 5, 13.5, 1.25, "MK44HT",
				"2020-03-01 03:34:21");
		System.out.println(obj2.orderId);
		System.out.println(obj2.productId);
		System.out.println(obj2.orderQuantity);
		System.out.println(obj2.eachProductPrice);
		System.out.println(obj2.tax);
		System.out.println(obj2.deliveryPostalCode);
		System.out.println(obj2.orderTimeStamp);
		
	}

}
