package org.sunbeam.test;
//A class from which, we can create only once instance is called singleton class.
//Creational Design Pattern

//Step 1 : Define class
class Singleton{
	//Step 2 : Make constructor private
	private Singleton( ) {
		System.out.println("Inside constructor");
	}
	
	//Step 4 : Declare static reference variable of same class
	static Singleton reference;	//Method Area : null
	
	//Step 3 : Define factory method
	//A method which hides instantiation from end user is called factory method.
	public static Singleton getInstance( ) {
		//Step 5 : check the value of reference for null and then instantiate class
		if( reference == null )
			reference = new Singleton( );	//OK
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
