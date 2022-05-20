
package interview.multithreading;

import java.util.Scanner;

class PrintEvenOdd
{
    private int number = 1;
    private int totalNumbersInSequence;

    public PrintEvenOdd(int totalNumbersInSequence) {
        this.totalNumbersInSequence = totalNumbersInSequence;
    }
    
    public synchronized void printNumbers(int result) {
//		synchronized (this) {
			while (number < totalNumbersInSequence) {
				while (number % 2 != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+"   "+number++);
				notifyAll();
			}
//		}
	}
    
}

class ThreadEvenOdd implements Runnable
{
    PrintEvenOdd printevenodd;
    private int result;

    public ThreadEvenOdd(PrintEvenOdd printevenodd, int result) {
        this.printevenodd = printevenodd;
        this.result = result;
    }

    @Override
    public void run() {
        printevenodd.printNumbers(result);
    }
    
}

public class MyOddEvenSynch {
    
    public static void main(String[] args) {
        int TOTAL_NUMBER_IN_SEQUENCE = 20;
        PrintEvenOdd evenoddSource = new PrintEvenOdd(TOTAL_NUMBER_IN_SEQUENCE);
        
        ThreadEvenOdd odd = new ThreadEvenOdd(evenoddSource, 1);
        ThreadEvenOdd even = new ThreadEvenOdd(evenoddSource, 0);
        
        Thread t1 = new Thread(odd, "Thread-1   Odd");
	Thread t2 = new Thread(even, "Thread-2  Even");
        
        t1.start();
        t2.start();
        
    }
    
}