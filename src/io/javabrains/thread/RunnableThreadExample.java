package io.javabrains.thread;

public class RunnableThreadExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This is inside the Runnable Thread");
				
			}
		});
		thread.run();
		
		Thread mylamba = new Thread(() -> System.out.println("This is inside the Lambda Runnable Thread"));
		mylamba.run();
	}

}
