package org.sunbeam.thread.test;
class Task implements Runnable{
	private Thread thread;
	public Task( String name ) {
		this.thread = new Thread(this, name );
		thread.start();
	}
	@Override
	public void run() {
		//TODO : Business Logic
	}
}
public class Program {
	public static void main(String[] args) {
		Task th1 = new Task("User Thread#1");
		
		Task th2 = new Task("User Thread#2");
		
		Task th3 = new Task("User Thread#3");
	}
}
