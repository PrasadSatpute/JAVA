package com.multithread;



public class MyThreadExtends extends Thread{
	
	private int threadNumber;
	public MyThreadExtends(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public MyThreadExtends() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i +" From Thread "+threadNumber);
//			if(threadNumber == 1) {
//				throw new RuntimeException();
//			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
