package org.sunbeam.dac.test;

import java.util.Arrays;

@SuppressWarnings("serial")
class NetworkException extends RuntimeException{
	public NetworkException(String message) {
		super(message);
	}
}

class Test{
	public Test() {
		System.out.println("Opening resource");
	}
	public void print( int count ) {
		try {
			if( count == 6 )
				Thread.currentThread().interrupt();
			System.out.println("Count	:	"+count);
			Thread.sleep(250);
		} catch (InterruptedException cause) {
			throw new RuntimeException( cause );
		}
	}
	public void close( ) {
		System.out.println("Closing resource");
		NetworkException ex = new NetworkException("Network error");
		//ex.addSuppressed(new RuntimeException() );
	}
}

public class Program {
	public static void f1( ) {
		Test t = null;
		try {
			t = new Test( );
			for( int count = 1; count <= 10; ++ count )
				t.print(count);
		}finally {
			t.close();
		}
	}
	public static void main(String[] args) {
		try {
			f1( );
		} catch (Exception e) {
			//Throwable[] arr = e.getSuppressed();
			System.out.println(Arrays.toString(arr));
			e.printStackTrace();
		}
	}
}
