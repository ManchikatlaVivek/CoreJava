package io.javabrains.lambdas;

public class TestLambda {

	public static void main(String[] args) {
//		testForward(()->System.out.println("THis is Swift Car"));
		
		Vehicle swift = ()->System.out.println("This is Hundai Car");
		swift.forward();

	}
	
	public static void testForward(Vehicle vehicle) {
		vehicle.forward();
	}

}
