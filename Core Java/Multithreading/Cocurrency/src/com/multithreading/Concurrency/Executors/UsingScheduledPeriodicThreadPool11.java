package com.multithreading.Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UsingScheduledPeriodicThreadPool11 {


    public static void main(String[] args) {
        System.out.println("Main Thread Start Here ...");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        
        for (int i = 0; i < 6; i++) {
            //If we want to execute task periodically
            executorService.scheduleAtFixedRate(new LoopTaskB(), 2, 5, TimeUnit.SECONDS);
        }
//        executorService.shutdown();

        System.out.println("Main Thread Ends Here ...");
    }
}
