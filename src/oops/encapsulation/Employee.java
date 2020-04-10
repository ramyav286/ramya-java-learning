package oops.encapsulation;

public class Employee {
	public int privateVar;
	public int defaultVar;
	public int protectedVar;
	public int publicVar;
	
	private void getEmpId() {
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}

}
