
package com.multithread.Synchronization;

class NumbersGenerator {
 
	private int number = 1;
	private int numberOfThreads;
	private int totalNumbersInSequence;
	
	public NumbersGenerator(int numberOfThreads, int totalNumbersInSequence) {
		this.numberOfThreads = numberOfThreads;
		this.totalNumbersInSequence = totalNumbersInSequence;
	}
	
	public void printNumbers(int result) {
		synchronized (this) {
			while (number < totalNumbersInSequence-1) {
				while (number % numberOfThreads != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" "+number++);
				notifyAll();
			}
		}
	}
}

class SequenceGeneratorTask implements Runnable {
 
	private NumbersGenerator numbersGenerator;
	private int result;
	
	public SequenceGeneratorTask(NumbersGenerator numbersGenerator, int result) {
		super();
		this.numbersGenerator = numbersGenerator;
		this.result = result;
	}
 
	@Override
	public void run() {
		numbersGenerator.printNumbers(result);
	}
 
}

public class SequenceNumberThread {
    private static final int TOTAL_NUMBER_IN_SEQUENCE = 10;
	private static final int TOTAL_NUMBER_OF_THREADS = 3;
	
	public static void main(String[] args) {
		
		NumbersGenerator numbersGenerator = new NumbersGenerator(TOTAL_NUMBER_OF_THREADS, TOTAL_NUMBER_IN_SEQUENCE);
		
		//Created three Threads
		Thread t1 = new Thread(new SequenceGeneratorTask(numbersGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(numbersGenerator, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask(numbersGenerator, 0), "Thread-3");
		
		//Start all three threads
		t1.start();
		t2.start();
		t3.start();
 
	}
}
