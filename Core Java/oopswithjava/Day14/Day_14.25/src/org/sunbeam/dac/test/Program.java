package org.sunbeam.dac.test;

public class Program {	//Program.class
	public static void main(String[] args) {	
		class Complex{	//Program$1Complex.class
			
		}
		
		//Behavior Parameterization
		
		//Object obj = null;	//object reference / reference
		
		//new Object( );	//Anonymous Instance
		
		/* Object obj = null;
		obj = new Object( ); */
		
		//Object obj = new Object( );	//Instance with reference
		
		
		//Method local anonymous inner class using concrete class
		Object obj = new Object( ) {	//Program$1.class
			private String message = "Hello";
			@Override
			public String toString() {
				return this.message;
			}
		};
		
		String str = obj.toString();
		System.out.println(str);
 	}
}
