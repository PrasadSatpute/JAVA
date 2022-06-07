package com.multithreading.Concurrency.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread Start Here ...");
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 6; i++) {
            executorService1.execute(new LoopTaskA());
        }
        executorService1.shutdown();        //It waits till all the submitted tasks execution gets finished.
        
//		ExecutorService executorService2 = Executors.newFixedThreadPool(3);
//
//		Future<String> result = null;
//		
//		for (int i = 0; i < 6; i++) {
//			result = executorService2.submit(new LoopTaskB(), "DONE");
//		}
//
//		while (result.isDone() == false) {
//
//			try {
//				System.out.println("The method return value : " + result.get());
//				break;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
////        TODO : Any Task after completion of Threads can be Done Here
//		executorService2.shutdown();

		System.out.println("Main Thread Ends Here ...");
	}
}
