package org.sunbeam.dac.test;

class Singleton{
	private Singleton() {
	}
	
	private static Singleton reference = null;
	
	public static Singleton getInstance( ) {
		if( reference == null )
			reference = new Singleton();
		return reference;
	}
}
public class Program {
	public static void main(String[] args) {
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
		Singleton s3 =  Singleton.getInstance();
	}
}
