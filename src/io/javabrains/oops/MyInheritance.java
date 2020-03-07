/**
 * @author Vivek Manchikatla
 * <h1> Inheritance Program</h1>
 */

package io.javabrains.oops;

public class MyInheritance {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.bark();

	}
}

class Animal {

	public Animal() {
		System.out.println("This is Animal constructor");
	}

	public void bark() {
		System.out.println("This is animal bark");
	}
}

class Cat extends Animal {

	public Cat() {
		System.out.println("This is cat constructor");
	}

	@Override
	public void bark() {
//		super.bark();
		System.out.println("This is Cat bark");
	}

}
