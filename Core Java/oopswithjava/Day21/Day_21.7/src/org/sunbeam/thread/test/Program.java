package org.sunbeam.thread.test;

import java.lang.Thread.State;

public class Program {
	public static void main(String[] args) {
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
