package org.sunbeam.thread.test;
class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Business Logic method");
	}
}
class CThread{
	private Thread thread;
	public CThread( String name ) {
		this.thread = new Thread( new Task(), name );
		thread.start();
	}
}
public class Program {
	public static void main(String[] args) {
		CThread th1 = new CThread("User Thread#1");
		
		CThread th2 = new CThread("User Thread#2");
		
		CThread th3 = new CThread("User Thread#3");
	}
}
