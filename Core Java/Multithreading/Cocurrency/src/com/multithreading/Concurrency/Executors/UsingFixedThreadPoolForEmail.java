package com.multithreading.Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingFixedThreadPoolForEmail {

	public static void main(String[] args) {
		System.out.println("Main Thread Start Here ...");
        ExecutorService executorService = Executors.newFixedThreadPool(3);

		Future<String> result = null;
		
		for (int i = 0; i < 6; i++) {
			result = executorService.submit(new LoopTaskB(), "All E-Mails Done");
		}
		
		while (result.isDone() == false) {

			try {
				System.out.println("All E-Mails are Successfully Send : " + result.get());
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Sleep for 1 second
			try {
				Thread.sleep(1000L);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//        TODO : Any Task after completion of Threads can be Done Here
		executorService.shutdown();

		System.out.println("Main Thread Ends Here ...");
	}

}
