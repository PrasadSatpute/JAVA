package com.multithread;

public class MultiThread1 {

	public static void main(String[] args) {
		
		MyThreadExtends myThing1 = new MyThreadExtends();
		MyThreadExtends myThing2 = new MyThreadExtends();
		myThing1.start();
		myThing2.start();

	}

}
