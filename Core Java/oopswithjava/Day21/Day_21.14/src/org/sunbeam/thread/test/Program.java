package org.sunbeam.thread.test;

import java.util.Scanner;

class Task extends Thread{
	public Task( String name ) {
		this.setName(name);
		this.start();
	}
	int count = 1;
	@Override
	public void run() throws RuntimeException {
		try {
			while( count <= 10 ) {
				if( !this.isInterrupted() ) {
					System.out.println("Count	:	"+count);
					count = count + 1;
					Thread.sleep(300);	
				}else
					Thread.interrupted();
					
			}
				
		} catch (Exception cause) {
			throw new RuntimeException(cause);
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Task thread = new Task( "User Thread" );
		
		try {
			while( true ) {
				if(thread.count == 5 )
					thread.interrupt();
				System.out.println( thread.getName()+"	"+thread.getState());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}