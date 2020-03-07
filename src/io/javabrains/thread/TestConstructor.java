package io.javabrains.thread;

public class TestConstructor {
	public int number;
	public String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor testConstructor = new TestConstructor(2,"Vivek");
		System.out.println("Number is "+testConstructor.number+" Name is "+testConstructor.name);
	}
	
	public TestConstructor(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	
	

}
