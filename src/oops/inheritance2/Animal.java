package oops.inheritance2;

public class Animal {
	
	public void eat() {
		System.out.println("i can eat");
	}
	public void walk() {
		System.out.println("i can walk");
	}
	public void sleep() {
		System.out.println("i can sleep");
	}

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.eat();
		animal1.walk();
		animal1.sleep();

	}

}
