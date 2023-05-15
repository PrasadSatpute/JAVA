package org.sunbeam.jdbc.test;

class Calculator {
	private int[] arr;

	public Calculator() {
		this.arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
	}

	public int sum(int value) throws InterruptedException {
		int total = 0;
		synchronized( this ) {		//synchronized block
			//Critical Section
			for (int index = 0; index < this.arr.length; ++index) {
				this.arr[index] = this.arr[index] + value;
				total = total + this.arr[index];
				System.out.println("Running total for " + Thread.currentThread().getName() + " is " + total);
				Thread.sleep(300);
			}
		}
		return total;
	}

	
	public synchronized int sub(int value) throws InterruptedException {
		int total = 0;
		synchronized( this ) {		//synchronized block
			//Critical Section
			for (int index = 0; index < this.arr.length; ++index) {
				this.arr[index] = this.arr[index] - value;
				total = total + this.arr[index];
				System.out.println("Running total for " + Thread.currentThread().getName() + " is " + total);
				Thread.sleep(300);
			}
		}
		return total;
	}

	public synchronized int multiplication(int value) throws InterruptedException {
		int total = 0;
		synchronized( this ) {		//synchronized block
			//Critical Section
			for (int index = 0; index < this.arr.length; ++index) {
				this.arr[index] = this.arr[index] * value;
				total = total + this.arr[index];
				System.out.println("Running total for " + Thread.currentThread().getName() + " is " + total);
				Thread.sleep(300);
			}
		}
		return total;
	}
}

class Task implements Runnable {
	private Thread thread;

	public Task(String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}

	static Calculator cal = new Calculator();

	@Override
	public void run() {
		try {
			int total = 0;
			if (thread.getName().equals("SumThread")) {
				total = cal.sum(5);
			} else if (thread.getName().equals("SubThread")) {
				total = cal.sub(5);
			} else {
				total = cal.multiplication(2);
			}
			System.out.println("Total	:	" + total);

		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}
	}
}

public class Program {
	public static void main(String[] args) {
		Task t1 = new Task("SumThread");
		Task t2 = new Task("SubThread");
		Task t3 = new Task("MultiplicationThread");
	}
}
