package com.multithread;

public class MultiThread3 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			MyThreadInterface myThing = new MyThreadInterface(i);
			Thread myThread = new Thread(myThing);
			myThread.run();
			System.out.println(myThread.isAlive());
		}
		
	}

}
