package com.multithread.Synchronization;

class PrintSequnceNumber {

    private int start = 1;
    private int totalNumber;

    public PrintSequnceNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public synchronized void printNumber(int totalThread, int threadNumber) {
        while (start <= totalNumber) {
            if (start != threadNumber && start <= totalThread) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + start++);
            }
            notifyAll();
        }
    }
}

class CountrThread implements Runnable {

    PrintSequnceNumber printSeqNum;
    private int totalThread;
    private int threadNumber;

    public CountrThread(PrintSequnceNumber printSeqNum, int totalThread, int threadNumber) {
        this.printSeqNum = printSeqNum;
        this.totalThread = totalThread;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        printSeqNum.printNumber(totalThread, threadNumber);
    }
}

public class SequenceNumber {

    public static void main(String[] args) {
        PrintSequnceNumber psn = new PrintSequnceNumber(5);

        CountrThread one = new CountrThread(psn, 5, 1);
        CountrThread two = new CountrThread(psn, 5, 2);
        CountrThread three = new CountrThread(psn, 5, 3);
        CountrThread four = new CountrThread(psn, 5, 4);
        CountrThread five = new CountrThread(psn, 5, 5);

        Thread t1 = new Thread(one, "One");
        Thread t2 = new Thread(two, "two");
        Thread t3 = new Thread(three, "three");
        Thread t4 = new Thread(four, "four");
        Thread t5 = new Thread(five, "five");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }

}
