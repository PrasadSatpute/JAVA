package org.sunbeam.test;

interface Printable{	//ISI
	
}
class Test implements Printable{	//Bajaj / Orpat	//Interface Implementation Inheritance
	
}
public class Program {	//Customer
	public static void main(String[] args) {
		Test t = new Test( );	//OK
		
		Printable p = new Test( );	//OK : Upcasting
	}
	public static void main1(String[] args) {
		Printable p = null;	//OK
		
		//p = new Printable( );	//NOT OK
	}
}
