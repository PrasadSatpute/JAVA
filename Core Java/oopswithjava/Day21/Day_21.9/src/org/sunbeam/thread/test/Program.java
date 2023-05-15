package org.sunbeam.thread.test;
class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Business Logic method");
	}
}
public class Program {
	public static void main6(String[] args) {
		Thread thread = new Thread(new Task(), "User Thread#1");
		thread.start();	//OK
		thread.start(); //IllegalThreadStateException
	}
	public static void main5(String[] args) {
		Runnable target = new Task();	//Upcasting
		Thread thread = new Thread(target, "User Thread#1");
		//thread.setDaemon(true);
		System.out.println(thread.isDaemon());	//false : User Thread
		//thread.setName("User Thread#1");
		thread.start(); //Request for the registration
	}
	public static void main4(String[] args) {
		Runnable target = new Task();	//Upcasting
		Thread thread = new Thread(target, "User Thread#1");
		//thread.setName("User Thread#1");
		thread.start(); //Request for the registration
	}
	public static void main3(String[] args) {
		Runnable target = new Task();	//Upcasting
		Thread thread = new Thread(target);
		thread.start(); //Request for the registration
	}
	public static void main2(String[] args) {
		Thread thread = new Thread();
		thread.start(); //Request for the registration
	}
	public static void main1(String[] args) {
		Thread thread = new Thread();
		System.out.println("Name	:	"+thread.getName());	//Thread-0
		System.out.println("State	:	"+thread.getState().name()); //NEW	
		thread.start();	//RUNNABLE
	}
}
