package org.sunbeam.thread.test;
public class Program {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println( thread.getPriority() ); //5
		thread.setPriority(Thread.NORM_PRIORITY - 6 ); //IllegalArgumentException
	}
	public static void main2(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println( thread.getPriority() ); //5
		thread.setPriority(Thread.NORM_PRIORITY + 6 ); //IllegalArgumentException
	}
	public static void main1(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println( thread.getPriority() ); //5
		//thread.setPriority( thread.getPriority() + 3 );
		thread.setPriority(Thread.NORM_PRIORITY + 3 );
		System.out.println( thread.getPriority() ); //8
	}
}