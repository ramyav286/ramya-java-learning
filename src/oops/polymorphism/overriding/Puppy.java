package oops.polymorphism.overriding;

public class Puppy extends Animal {
	
	public void eat() {
		System.out.println("inside puppy class: Puppy is eating");
	}
	public void eat(String dogBreed) {
		System.out.println("inside puppy class: Puppy is eating");
		
	}

	public static void main(String[] args) {
		Puppy puppy1 = new Puppy();
		puppy1.eat();
		puppy1.eat("bull dog");

	}

}
