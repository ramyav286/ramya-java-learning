package classandobjects.membersmethods;

public class MemberMethods {
	
	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;
	
	MemberMethods() {
		
		orderId = 23;
		productId = 1;
		orderQuantity = 5;
		eachProductPrice = 12.5;
		tax = 0.25;
		deliveryPostalCode = "SL38SR";
		orderTimeStamp ="2020-02-02  23:35:25";
	}
		
		public void makeAnOrderMethod() {
			System.out.println("always be positive");}
			
			public double returnTotalOrderPriceMethod() {
				return (orderQuantity * eachProductPrice) + tax;
			}
				
				public String returnFullAddress() {
					return "humber way, SL";
				}
					public double calculatedFinalPriceAfterDisc(double discountFromCaller) {
						double totalPriceBeforeDisc = (orderQuantity * eachProductPrice)+ tax;
						double totalPriceafterDisc= totalPriceBeforeDisc-discountFromCaller;
						return totalPriceafterDisc;
					}
					
					public double calculatedFinalPriceAfterGenderDisc (double discountFromCaller, double genderDiscount) {
						double totalPriceBeforeDisc = (orderQuantity*eachProductPrice)+tax;
						double totalPriceafterDisc= totalPriceBeforeDisc- discountFromCaller-genderDiscount;
						return totalPriceafterDisc;

}

}



