package oops.diffencapsulationpackage;

import oops.encapsulation.Employee;

public class EmployeeCallerIsARelationFromDifPack extends Employee {
	

	public void methodWhichAccessParentClassVariable() {
		
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}

}
