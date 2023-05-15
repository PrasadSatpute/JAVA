package org.sunbeam.thread.test;

import java.util.Scanner;

class Task extends Thread{
	public Task( String name ) {
		this.setName(name);
		this.start();
	}
	@Override
	public void run() throws RuntimeException {
		try {
			for( int count = 1; count <=  10; ++ count ) {
				System.out.println("Count	:	"+count);
				if( count == 5 )
					return;
					//throw new InterruptedException();
				Thread.sleep(300);	//Blocking Call :  TIMED_WAITING
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Thread thread = new Task( "User Thread" );
		
		try {
			while( true ) {
				System.out.println( thread.getName()+"	"+thread.getState());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}