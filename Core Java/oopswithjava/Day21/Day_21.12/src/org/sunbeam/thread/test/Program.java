package org.sunbeam.thread.test;
class Task extends Thread{
	public Task( String name ) {
		//super( name );
		this.setName(name);
		this.start();
	}
	@Override
	public void run() {
		System.out.println("Inside run");
	}
}
public class Program {
	public static void main(String[] args) {
		Thread thread = new Task( "ABC" );
	}
}