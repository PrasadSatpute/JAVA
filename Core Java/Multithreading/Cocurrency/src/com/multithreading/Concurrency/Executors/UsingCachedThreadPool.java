package com.multithreading.Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

    public static void main(String[] args) {
        System.out.println("Main Thread Start Here ...");
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            executorService.execute(new LoopTaskA());
        }
//        executorService.shutdown();

        System.out.println("Main Thread Ends Here ...");
    }
}
