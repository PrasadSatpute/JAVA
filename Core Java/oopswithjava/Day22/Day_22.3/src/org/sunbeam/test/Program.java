package org.sunbeam.test;
class Singleton{
	private int number;
	private Singleton( ) {
		this.number = 10;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	static Singleton reference;
	public static synchronized Singleton getInstance( ) {
		if( reference == null )
			reference = new Singleton( );
		return reference;
	}
	
	/* public static Singleton getInstance( ) {
		synchronized( Singleton.class ) {
			if( reference == null )
				reference = new Singleton( );
		}
		return reference;
	} */
}
public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
		s1.setNumber( 50 );
		
		System.out.println("Number	:	"+s1.getNumber());
	}
}
