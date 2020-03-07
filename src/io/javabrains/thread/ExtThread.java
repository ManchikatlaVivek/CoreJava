package io.javabrains.thread;

public class ExtThread extends Thread{

	public static void main(String[] args) {	
		ExtThread th = new ExtThread();
		th.run();
	}
	
	public void run() {
		try {
			System.out.println(Thread.currentThread());
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
