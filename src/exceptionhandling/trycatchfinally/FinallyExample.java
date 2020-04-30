package exceptionhandling.trycatchfinally;

public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("program execution started");
		int c = 0;
		try {
			System.out.println("Try Block Started");
			int a = 15;
			int b = 0;
			
			System.out.println("Division Operation");
			c = a/b;
			
			System.out.println("After Division Operation:" + c);
			System.out.println("Try Block Ended");
		} catch (Exception e) {
			System.out.println("Catch Block ended");
		} finally {
			System.out.println("Inside finally block");
		}
		
	
		int m = 5;
		int n = 10;
		System.out.println("Addition Operation");
		int l = m+n;
		System.out.println("Sum:" + 1);
		
		System.out.println("Final Calculated value is:" + c * 1);
		System.out.println("program execution ended");
		}
		

	}


