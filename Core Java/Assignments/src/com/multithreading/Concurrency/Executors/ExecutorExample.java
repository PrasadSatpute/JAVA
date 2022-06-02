package com.multithreading.Concurrency.Executors;

import java.util.concurrent.Executor;


public class ExecutorExample {
    public static void main(String[] args) {
        executorInvoke();
    }
    
    private static void executorInvoke(){
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor Example");
        });
    }
    
}
