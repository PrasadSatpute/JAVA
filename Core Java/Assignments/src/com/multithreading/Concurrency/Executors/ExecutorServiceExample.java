package com.multithreading.Concurrency.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceExample {
    public static void main(String[] args) {
        executorInvoke();
    }
    
    private static void executorInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("Executor Service Example");
        });
        executorService.shutdown();
    }
    
}
