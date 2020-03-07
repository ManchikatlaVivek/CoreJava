package io.javabrains.innerclasses;

public class OuterClass {
	
	int id;

	public OuterClass() {
		System.out.println("This is outer Class Def constructor");
	}

	public OuterClass(int id) {
		super();
		this.id = id;
		System.out.println("Outer class variable is "+this.id);
	}
	
	
	
}
