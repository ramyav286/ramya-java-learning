package exceptionhandling.handleatorigin;

public class HandleAtOrigin {
	public int getModulousValue() {
		int c = 0;
		int a = 15;
		int b = 0;
		System.out.println("division operation");
		
		try { c = a/b;
		} catch ( Exception e) {
			System.out.println("catch block inside getModulousValue method");
			c = 10; 
		}
		System.out.println("after division operation :" + c);
		return c;
	}
	public int getSum() {
		int m = 5;
		int n = 10;
		System.out.println("addition operation");
		int l = m + n;
		System.out.println("sum:" + 1);
		return 1;
		
		
		}
	}


