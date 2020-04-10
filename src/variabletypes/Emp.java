package variabletypes;

public class Emp {
	
	int empId;
	String empName;
	double monthlySalary;
	double rating;
	static String orgName = "TCS";
	static double maxBonus = 4000;
	static int empCount = 0;
	
	Emp(int empIdFrom, String empNameFrom, double monthlySalaryFrom, double ratingFrom){
		empId = empIdFrom;
		empName = empNameFrom;
		monthlySalary = monthlySalaryFrom;
		rating = ratingFrom;
	}
		
		public void calculateCTC() {
			double bonusComponent;
			double totalCostToComp;
			bonusComponent = (rating/5) * maxBonus;
			System.out.println("Bonus Component is:" + bonusComponent);
			totalCostToComp = (monthlySalary*12) + bonusComponent;
			System.out.println("Total CTC is:" + totalCostToComp);
		}
		public void salaryPerEmp() {
			System.out.println(empName);
		}
		public static void incrementEmpCount() {
			empCount = empCount + 1;
			System.out.println("Emp Count:" + empCount);
		}
	
public static void main(String[] args) {
		System.out.println("started execution");
		System.out.println("i am learning static variables");
		
		Emp emp1 = new Emp(1, "ramya", 3000, 4.5);
		System.out.println(emp1.empId);
		System.out.println(emp1.orgName);
		emp1.calculateCTC();
		emp1.incrementEmpCount();

	}

}
