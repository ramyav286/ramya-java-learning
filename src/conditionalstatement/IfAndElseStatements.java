package conditionalstatement;

public class IfAndElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 24;
 int remainder = a % 2;
 System.out.println(remainder);
 if (remainder == 0) {
	 System.out.println("even number");
 }
 if (remainder == 0) {
	 System.out.println("i am even number");
 } else { System.out.println("i am odd number");
 
	}
 char gender = 'f';
 int age = 24;
 if (gender == 'f') {
	 if (age >= 13 && age <= 20) {
		 System.out.println("female tennager");
	 } else if (age < 13) {
		 System.out.println("girl");
	 } else if (age > 19) {
		 System.out.println("woman");
	 }
 }
	}
}


