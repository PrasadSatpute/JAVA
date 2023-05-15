package org.sunbeam.test;
//
class Singleton{
	private Singleton( ) {
		System.out.println("Inside constructor");
	}
	static Singleton reference;	
	public static Singleton getInstance( ) {
		synchronized( Singleton.class ) {
			if( reference == null )
				reference = new Singleton( );
		}
		return reference;
	}
}
public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		Singleton s3 = Singleton.getInstance();
	}
}
