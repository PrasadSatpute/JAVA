package com.multithreading.CallableRunnableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class sum implements Callable<Integer>
{
	private int input;
	
	public sum(int input) {
		this.input = input;
	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(1000);
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
}

public class CallableFutureSumDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Future<Integer> result = executorService.submit(new sum(10));
		
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
