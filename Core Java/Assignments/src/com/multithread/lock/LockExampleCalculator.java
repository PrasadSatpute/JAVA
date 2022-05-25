package com.multithread.lock;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Calculator {

    public double value;

    public Calculator(double value) {
        this.value = value;
    }

    private double result = 0.0D;
    Lock lock = new ReentrantLock();

    public void add(double value) {
        try {
            lock.lock();
            this.result += value;
            System.out.println("Add Value = " + result);
        } finally {
            lock.unlock();
        }
    }

    public void subtract(double value) {
        try {
            lock.lock();
            this.result -= value;
            System.out.println("Subtract Value = " + result);
        } finally {
            lock.unlock();
        }
    }

    public void calculate() {
        try {
            lock.lock();
            int choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            while (choice != 0) {
                switch (choice) {
                    case 1:
                        add(value);
                        break;
                    case 2:
                        subtract(value);
                        break;
                    case 0:
                        System.exit(0);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}

public class LockExampleCalculator {

    public static void main(String[] args) {
        Calculator c = new Calculator(10);
        c.calculate();
    }
}
