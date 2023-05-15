package org.sunbeam.dac.test;
abstract class Printable{
	public abstract void print( );
}
class Test extends Printable{
	@Override
	public void print()throws RuntimeException{
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				if( count == 5 )
					Thread.currentThread().interrupt();
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause); //Exception Chaining
		}
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Printable p = new Test( );
			p.print();
		} catch (RuntimeException e) {
			Throwable cause = e.getCause();
			if( cause != null )
				System.out.println(cause);
			e.printStackTrace();
		}
	}
}
