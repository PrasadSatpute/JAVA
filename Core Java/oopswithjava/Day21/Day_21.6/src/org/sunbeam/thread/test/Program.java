package org.sunbeam.thread.test;
public class Program {
	public static void main(String[] args) {
		//public static Thread currentThread()
			//Returns a reference to the currently executing thread object.
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());	//Thread[main,5,main]
		//Returns a string representation of this thread, including the thread's name, priority, and thread group.
	}
}
