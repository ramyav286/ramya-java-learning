package oops.inheritance;

public class father extends GrandFather {
	
	int fatherAge = 50;
	int fatherEarnings = 2000000;
	
	public void getFatherEarnings() {
		System.out.println("Father Earnings:" + fatherEarnings);
	}
	 
	public void getFatherTotalEarnings() {
		int fatherTotalEarnings;
		fatherTotalEarnings = fatherEarnings + grandFatherEarnings;
		System.out.println("Father Total Earnings are:" + fatherTotalEarnings);
	}

	public static void main(String[] args) {
		father father = new father();
		System.out.println(father.fatherAge);
		System.out.println(father.fatherEarnings);
		father.getFatherEarnings();
		father.getFatherTotalEarnings();
		System.out.println(father.grandFatherAge);
		father.getGrandFatherEarnings();
		

	}

}
