package oops.inheritance2;

public class Puppy extends Animal {
	
	public void bark() {
		System.out.println("i can bark");
	}
	

	public static void main(String[] args) {
		Puppy puppy1 = new 	Puppy();
		puppy1.eat();
		puppy1.walk();
		puppy1.sleep();
		puppy1.bark();

	}

}
