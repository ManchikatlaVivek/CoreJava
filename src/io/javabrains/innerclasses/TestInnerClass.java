package io.javabrains.innerclasses;

public class TestInnerClass extends OuterClass {

	public static void main(String[] args) {
		TestInnerClass testInnerClass = new TestInnerClass();		
		System.out.println(" This is the variable of inner class "+testInnerClass.id);
		
	}

	public TestInnerClass() {
		super(30);
		this.id = 20;
		System.out.println("This is the Inner Class");
	}
	

}
