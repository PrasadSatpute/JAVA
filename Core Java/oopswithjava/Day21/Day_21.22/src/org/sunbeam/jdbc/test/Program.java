package org.sunbeam.jdbc.test;
class Task implements Runnable{
	Thread thread;
	public Task( String name ) {
		this.thread = new Thread(this, name );
		//this.thread.start();	//Look Here
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().toString()); //Thread[User Thread,5,main]
	}
}
public class Program {
	public static void main(String[] args)  {
		System.out.println(Thread.currentThread().toString());	//Thread[main,5,main]
		
		Task t = new Task( "User Thread" );
		t.thread.start();
	}
}
