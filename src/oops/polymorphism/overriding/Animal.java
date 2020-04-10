package oops.polymorphism.overriding;

public class Animal {
 
	public void eat () {
		System.out.println("inside animal class: Animal is eating");
	}
	
	public void eat (String dogBreed) {
		System.out.println("inside animal class: Animal is eating");
	}
}
