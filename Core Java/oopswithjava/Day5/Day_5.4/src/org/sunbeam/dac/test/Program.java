package org.sunbeam.dac.test;
class Test{
	private int num1;	//Non Static Field( also called instance variable )
	private int num2;	//Non Static Field( also called instance variable )
	private int num3;	//Non Static Field( also called instance variable )
	
	public Test(int num1, int num2) {	//parameterized constructor
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 500;
	}
	//Concrete Method
	public void printRecord( /*Test this*/) {	//Non Static Method( also called as instance method )
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+this.num3);
		System.out.println("-----------------------------");
	}
		
}
public class Program {
	public static void main(String[] args) {
		Test t1 = new Test( 10, 20 );
		Test t2 = new Test( 30, 40 );
		Test t3 = new Test( 50, 60 );
		
		t1.printRecord( );	//t1.printRecord( t1 );
		t2.printRecord( );	//t2.printRecord( t2 );
		t3.printRecord( );	//t3.printRecord( t3 );
	}
}
