package org.sunbeam.dac.test;

public class Program {
	public static void main(String[] args) {
		//java.lang.Exception
				//java.lang.InterruptedException
		
		InterruptedException ex1 = new InterruptedException( ); //OK
		
		Exception ex2 = new InterruptedException( ); //OK : Upcasting
	}
	public static void main1(String[] args) {
		//java.lang.Exception
			//java.lang.RuntimeException
				//java.lang.NullPointerException
		
		NullPointerException ex1 = new NullPointerException();	//OK
		
		RuntimeException ex2 = new NullPointerException(); //OK : Upcasting
		
		Exception ex3 = new NullPointerException(); //OK : Upcasting
	}
}
