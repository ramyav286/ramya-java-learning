package classandobject.parameterizexconsteuctors;

public class OrderClassWithParamConstructor {
	
	int orderId;
	 int productId;
	 int orderQuantity;
	 double eachProductPrice;
	 double tax;
	 String deliveryPostalCode;
	 String orderTimeStamp;
	 
	 OrderClassWithParamConstructor(int orderIdFromCaller, int productIdFromCaller, int orderQuantityFromCaller,
				double eachProductPriceFromCaller, double taxFromCaller, String deliveryPostalCodeFromCaller,
				String orderTimeStampFromCaller) {
		 
		 orderId = orderIdFromCaller;
		 
		 productId= productIdFromCaller;
		 
		  orderQuantity = orderQuantityFromCaller;
		 
		 eachProductPrice= eachProductPriceFromCaller;
		 
		 tax= taxFromCaller;
		 
		 deliveryPostalCode= deliveryPostalCodeFromCaller;
		 
		 orderTimeStamp= orderTimeStampFromCaller;}
		 
		 public void makeAnOrderMethod() {
			 System.out.println("believe in yourself");}
			 
			 public void cancelAnOrderMethod() {
				 System.out.println("have faith in god");}
				 
				 public void returnAnOrderMethod() {
					 System.out.println("self love");
				 }
				 
				 public void calculateTotalOrderPriceMethod() {
					 System.out.println((orderQuantity * eachProductPrice)+tax);
					 
					 
				 }
}
			 
		 
	 
	 
	 
		
			 
		 
	 
	 
	 
		
		 




