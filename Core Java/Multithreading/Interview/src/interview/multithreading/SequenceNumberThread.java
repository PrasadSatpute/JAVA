
package interview.multithreading;

class NumbersGenerator {
 
	private int number = 1;
	private int totalNumbersInSequence;
	
	public NumbersGenerator(int totalNumbersInSequence) {
		this.totalNumbersInSequence = totalNumbersInSequence;
	}
	
	public void printNumbers(int result) {
		synchronized (this) {
			while (number < totalNumbersInSequence) {
				if (number % 2 != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+"   "+number++);
				notifyAll();
			}
		}
	}
}

class SequenceGeneratorTask implements Runnable {
 
	private NumbersGenerator numbersGenerator;
	private int result;
	
	public SequenceGeneratorTask(NumbersGenerator numbersGenerator, int result) {
		this.numbersGenerator = numbersGenerator;
		this.result = result;
	}
 
	@Override
	public void run() {
		numbersGenerator.printNumbers(result);
	}
 
}

public class SequenceNumberThread {
    private static final int TOTAL_NUMBER_IN_SEQUENCE = 20;
	
	public static void main(String[] args) {
		
		NumbersGenerator numbersGenerator = new NumbersGenerator(TOTAL_NUMBER_IN_SEQUENCE);
		Thread t1 = new Thread(new SequenceGeneratorTask(numbersGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(numbersGenerator, 0), "Thread-2");
		t1.start();
		t2.start();
		
 
	}
}
