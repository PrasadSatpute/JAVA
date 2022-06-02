package com.multithreading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8UsingSingleThreadPool {

    public static void main(String[] args) {
        System.out.println("Main Thread Start Here ...");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++) {
            executorService.execute(new LoopTaskA());
        }
        
      //It waits till all the submitted tasks execution gets finished.
        executorService.shutdown();

        System.out.println("Main Thread Ends Here ...");
    }
}
