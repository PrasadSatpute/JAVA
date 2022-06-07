package com.multithreading.Concurrency.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class NewThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread executed under an executor");
    }
}
class ExecutorImp implements Executor {     //Implement Executor interface which Forcefully Override the execute method
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorImp obj = new ExecutorImp();
        try {
            obj.execute(new NewThread());
        } catch (RejectedExecutionException | NullPointerException exception) {
            System.out.println(exception);
        }
    }
}
