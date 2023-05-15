package org.sunbeam.dac.test;
class A{
	public void showRecord( ) {
		System.out.println("Super class method");
	}
	
	public void print( ) {
		System.out.println("Super class print method");
	}
}
class B extends A{
	public void displayRecord( ) {
		System.out.println("Sub class method");
	}
	public void print( ) {
		System.out.println("Sub class print method");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new B( );	//Upcasting
		a.print(); //DMD
	}
	public static void main1(String[] args) {
		A a = new B( );	//Upcasting
		
		a.showRecord(); //OK
		
		//a.displayRecord(); //NOT OK
		
		B b = (B) a; //Downcasting
		
		b.displayRecord( );
	}
}
