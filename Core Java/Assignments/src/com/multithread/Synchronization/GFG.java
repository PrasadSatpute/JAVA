/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithread.Synchronization;

// Java program for the above approach
public class GFG {
    int counter = 1;

    static int N;
    public void printOddNumber() {
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("even->" + counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("odd->" + counter + " ");
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        GFG mt = new GFG();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
