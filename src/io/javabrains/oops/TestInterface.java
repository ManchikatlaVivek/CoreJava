package io.javabrains.oops;

public interface TestInterface {
	public void hello();
	
	public void greet();
	
	public void bye();
}


class MyInterface implements TestInterface{

	@Override
	public void hello() {
		System.out.println("Hello");
	}

	@Override
	public void greet() {
		System.out.println("Greeting");		
	}

	@Override
	public void bye() {
		System.out.println("Bye");		
	}
	
	public static void main(String [] args) {
		TestInterface obj = new MyInterface();
		obj.hello();
		obj.greet();
		obj.bye();		
	}
	
}

class DummyInterface implements TestInterface{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		
	}
	
}
