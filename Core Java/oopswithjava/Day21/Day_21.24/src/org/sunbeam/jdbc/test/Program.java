package org.sunbeam.jdbc.test;
public class Program {
	public String message = "Hello";
	/* public void print( ) throws InterruptedException {
		synchronized( message ) {
			System.out.println(message);	//Hello
			this.wait( 1000 ); //IllegalMonitorStateException
		}
	} */
	/* public void print( ) throws InterruptedException {
		synchronized( this ) {
			System.out.println(message);	//Hello
			this.wait( 1000 ); //IllegalMonitorStateException
		}
	} */
	
	public void print( ) throws InterruptedException {
		synchronized( message ) {
			System.out.println(message);	//Hello
			message.wait( 1000 ); //IllegalMonitorStateException
		}
	}
	public static void main(String[] args)  {
		try {
			Program p = new Program( );
			p.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
