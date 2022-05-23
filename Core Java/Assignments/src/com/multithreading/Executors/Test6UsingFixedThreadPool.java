
package com.multithreading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test6UsingFixedThreadPool {
    public static void main(String[] args) {
        System.out.println("Main Thread Start Here ...");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 6; i++) {
            executorService.execute(new LoopTaskA());
        }
        executorService.shutdown();
        
        System.out.println("Main Thread Ends Here ...");
    }
}
