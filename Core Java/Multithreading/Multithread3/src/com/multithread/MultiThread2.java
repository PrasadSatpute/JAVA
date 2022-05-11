package com.multithread;

public class MultiThread2 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			MyThreadExtends myThing = new MyThreadExtends(i);
			myThing.start();
			System.out.println(myThing.isAlive());
		}
		
	}

}
