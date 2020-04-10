package mainmethod;

public class MyClass {
	
	int myId;
	String myName;
	
	MyClass (int myIdFromCaller, String myNameFromCaller){
		myId = myIdFromCaller;
		myName = myNameFromCaller;
		}
	public void getMyName() {
		System.out.println(myName);
	}
	
	public void getMyId() {
		System.out.println(myId);
	}

	public static void main (String [] studentNames) {
		for (int i=0;i<studentNames.length;i++) {
			System.out.println("Student Is:"+ studentNames[i]);
		}
		System.out.println("Program execution started");
		MyClass obj1 = new MyClass(1, "Ramya");
		obj1.getMyName();
		obj1.getMyId();
		
	}
}
