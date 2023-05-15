package org.sunbeam.dac.test;
class Test{
	private int num1;			//Instance Variable
	private int num2;			//Instance Variable
	private static int num3;	//Class Level Variable

	//Concrete Method
	public void setNum1( /*Test this,*/ int num1 ) {	//Instance method
		this.num1 = num1;
	}
	//Concrete Method
	public void setNum2( /*Test this,*/ int num2 ) {	//Instance method
		this.num2 = num2;
	}
	//Concrete Method
	public static void setNum3( int num3 ) {	//Class Level Method
		//this.num1 = 10;	//Cannot use this in a static context
		//this.num2 = 20;	//Cannot use this in a static context
		Test.num3 = num3;
	}
	public void printRecord( /*Test this = t1*/ ) {	//Instance method
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
		System.out.println("Num3	:	"+Test.num3);
	}
	public static void displayRecord( ) {
		Test t1 = new Test( );
		t1.setNum1( 10 );	//t1.setNum1( t1, 10 );
		t1.setNum2( 20 );		//t1.setNum2(t1, 20);
		Test.setNum3(500);
		
		t1.printRecord( );	//t1.printRecord( t1 );
	}
}
public class Program {
	public int num1 = 10;
	public static int num2 = 20;
	public static void main(String[] args) {
		//System.out.println("Num1	:	"+num1);	//NOT OK
		Program p = new Program( );
		System.out.println("Num1	:	"+p.num1);	//OK : 10
		System.out.println("Num2	:	"+num2);	//OK : 20
	}
}
