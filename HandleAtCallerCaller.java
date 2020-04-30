package exceptionhandling.handleatcaller;

public class HandleAtCallerCaller {

	public static void main(String[] args) {
		System.out.println("Program execution started");
		
		HandleAtCaller obj1 = new HandleAtCaller();
		System.out.println("object created");
		int x;
		try {
			x = obj1.getModulousValue();}
		catch (Exception e) {
			System.out.println("Inside catch block in calling program");
			x = 10;
			System.out.println("use mask");
		} int y = obj1.getSum();
		System.out.println("final calculated value is:" + (x*y));
		System.out.println("program eexecution ended");
		}

	}



