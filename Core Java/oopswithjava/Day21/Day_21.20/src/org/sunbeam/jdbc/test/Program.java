package org.sunbeam.jdbc.test;

import java.util.concurrent.locks.ReentrantLock;

class Calculator{
	private int[] arr;
	public Calculator() {
		this.arr = new int[ ] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
	}
	public int sum( int value ) throws InterruptedException {
		int total = 0;
		for( int index = 0; index < this.arr.length; ++ index ) {
			this.arr[ index ] = this.arr[ index ] + value;
			total = total + this.arr[ index ];
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+total);
			Thread.sleep(300);
		}
		return total;
	}
	public int sub( int value ) throws InterruptedException {
		int total = 0;
		for( int index = 0; index < this.arr.length; ++ index ) {
			this.arr[ index ] = this.arr[ index ] - value;
			total = total + this.arr[ index ];
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+total);
			Thread.sleep(300);
		}
		return total;
	}
	public int multiplication( int value ) throws InterruptedException {
		int total = 0;
		for( int index = 0; index < this.arr.length; ++ index ) {
			this.arr[ index ] = this.arr[ index ] * value;
			total = total + this.arr[ index ];
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+total);
			Thread.sleep(300);
		}
		return total;
	}
}

class Task implements Runnable{
	private Thread thread;
	public Task( String name ) {
		this.thread = new Thread(this, name );
		this.thread.start();
	}
	static Calculator cal = new Calculator();
	static ReentrantLock calLock = new ReentrantLock();
	@Override
	public void run() {
		try {
			calLock.lock();
			//Critical Section
			int total = 0;
			if( thread.getName().equals("SumThread") ) {
				total = cal.sum(5);
			}else if( thread.getName().equals("SubThread") ) {
				total = cal.sub(5);
			}else {
				total = cal.multiplication(2);
			}
			System.out.println("Total	:	"+total);
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}finally {
			calLock.unlock();
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Task t1 = new Task( "SumThread" );
		Task t2 = new Task( "SubThread" );
		Task t3 = new Task( "MultiplicationThread" );
	}
}
