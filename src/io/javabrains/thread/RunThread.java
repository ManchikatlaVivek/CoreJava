package io.javabrains.thread;

public class RunThread implements Runnable {

	public static void main(String[] args)  {
		
		RunThread mt = new RunThread();
		mt.run();
	}

	@Override
	public void run() {
		System.out.println("Thread is Created");
	}

}
