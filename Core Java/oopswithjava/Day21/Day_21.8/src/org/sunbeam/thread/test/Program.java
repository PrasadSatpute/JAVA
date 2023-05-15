package org.sunbeam.thread.test;

import java.lang.Thread.State;

class Test{
	public Test( ) {
		System.out.println("Inside constructor of class Test");
	}
	public void print( ) {
		System.out.println("Printing state of Test instance.");
	}
	@Override
	public void finalize( ){
		System.out.println("Inside finalize method");
		Thread thread = Thread.currentThread();
		
		System.out.println("Name		:	"+thread.getName());
		System.out.println("Priority	:	"+thread.getPriority());
		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Group Name	:	"+ group.getName());
		State state = thread.getState();
		System.out.println("State		:	"+state.name());
		System.out.println("Type		:	"+( thread.isDaemon() ? "Daemon Thread" : "User Thread"));
		System.out.println("Status		:	"+( thread.isAlive() ? "Alive" : "Dead"));
	}
}
public class Program {
	public static void main(String[] args) {
		Test t = new Test( );
		t.print();
		t = null;
		System.gc();//Request to invoke garbage collector	
	}
}
