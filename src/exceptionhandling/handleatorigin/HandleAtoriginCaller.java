package exceptionhandling.handleatorigin;

public class HandleAtoriginCaller {

	public static void main(String[] args) {
		System.out.println("program execution started");
		HandleAtOrigin obj1 = new HandleAtOrigin();
		System.out.println("object created");
		int x = obj1.getModulousValue();
		int y = obj1.getSum();
		System.out.println("final calculated value is:" +(x*y));
		System.out.println("program execution ended");

	}

}
