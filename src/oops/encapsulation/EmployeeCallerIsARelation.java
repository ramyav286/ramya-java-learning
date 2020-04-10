package oops.encapsulation;

public class EmployeeCallerIsARelation extends Employee {
	
	public void methodWhichAccessParentClassVariable() {
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}

}
