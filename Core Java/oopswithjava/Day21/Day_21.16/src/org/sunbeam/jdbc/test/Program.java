package org.sunbeam.jdbc.test;
//Java Complete Reference : Herbert Schildt
//Read Core Java Vol-I : Kay Horstmann
//Concurrency In Action
//Thread Concepts : Allen Downey

class Task implements Runnable{
	private Thread thread;
	public Task( String name ) {
		this.thread = new Thread(this, name );
		this.thread.start();
	}
	@Override
	public void run() {
		System.out.println(thread.getName()+"	"+thread.getPriority());
	}
}
public class Program {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.setPriority(Thread.NORM_PRIORITY - 3);
		System.out.println(thread.getName()+"		"+thread.getPriority());
		
		Runnable target = new Task("Thread#1");
	}
}
