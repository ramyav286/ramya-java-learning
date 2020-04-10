package classandobjects.constructoroverloading;

public class Employee {
	int empId;
	String empName;
	String orgName;
	double monthlySalary;
	
	Employee (){
		empId = 1;
		empName= "SAM";
		orgName="TCS";
		monthlySalary = 3000.00;
	}
		
	Employee (int empIDFrom, String empNameFrom,String orgNameFrom, double monthlySalaryFrom){
				empName= empNameFrom;
				orgName= "TCS";
				monthlySalary= monthlySalaryFrom;
				empId=empIDFrom;
			}
			public void getEmpId() {
				System.out.println("Emp Id is:"+empId);
			}
				public void getEmpName() {
					System.out.println("Emp Name is:"+empName);
				}
					public void getNetSalary() {
						System.out.println(monthlySalary*12); }
								
	public static void main (String[] args) {
		Employee obj1= new Employee();
		obj1.getEmpId();
		obj1.getEmpName();
		obj1.getNetSalary();
		System.out.println(obj1.orgName);
		
		Employee obj2= new Employee (2, "ramya", "TCS", 2900);
		obj2.getEmpId();
		obj2.getEmpName();
		obj2.getNetSalary();
		System.out.println(obj1.orgName);
		
	}
					}
				
