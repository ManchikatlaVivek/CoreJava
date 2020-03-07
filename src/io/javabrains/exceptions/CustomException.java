package io.javabrains.exceptions;

public class CustomException extends Exception {
	
	public CustomException(String s) {
		super(s);
	}
	
	public static void main(String [] args) throws CustomException {
		try {
		throw new CustomException("This is a custom exception thrown");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
