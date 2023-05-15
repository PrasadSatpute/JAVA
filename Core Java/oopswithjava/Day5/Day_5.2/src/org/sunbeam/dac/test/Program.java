package org.sunbeam.dac.test;

class Test{
	private final int number = 10;
	public Test() {
		//this.number = 50;	//Error
	}
	public void showRecord() {
		//++ number;	//Not OK
		System.out.println("Number	:	"+number);
	}
	public void displayRecord() {
		//++ number;	//Not OK
		System.out.println("Number	:	"+number);
	}	
}
public class Program {
	public static void main(String[] args) {
		Test t = new Test( );
		t.showRecord( );
		t.displayRecord( );
	}
}
