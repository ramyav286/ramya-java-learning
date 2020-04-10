package oops.polymorphism;

public class PolyOverLoading {
	public void getSum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void getSum(int l, int m,int n) {
		System.out.println(l+m+n);
	}
	
	public void getSum(String str1, String str2) {
		System.out.println(str1+str2);
	}

	public static void main(String[] args) {
		PolyOverLoading obj1 = new PolyOverLoading();
		obj1.getSum(2, 3);
		obj1.getSum(10, 20,30);
		obj1.getSum("Ramya", "Vemula");
		

	}

}
