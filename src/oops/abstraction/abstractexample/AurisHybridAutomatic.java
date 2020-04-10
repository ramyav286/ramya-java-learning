package oops.abstraction.abstractexample;

public  class AurisHybridAutomatic extends AbstractCar {
	
	public void transmission () {
		System.out.println("i am auris automatic varient");
	}
    public void fuelType() {
	System.out.println("i am auris hybrid varient");
}
    public static void main (String [] args) {
	
	AurisHybridAutomatic obj1 = new AurisHybridAutomatic();
	AbstractCar obj2 = new AurisHybridAutomatic();
}
}