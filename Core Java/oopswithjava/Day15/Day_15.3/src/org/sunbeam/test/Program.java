package org.sunbeam.test;
interface Printable{	
	int number = 10;
	//public static final int number = 10;
	
	void print ( );
	//public abstract void print ( );
}
class Test implements Printable{
	@Override
	public void print() {
		System.out.println("Number	:	"+Printable.number);
	}
}
public class Program {	//Customer
	public static void main(String[] args) {
		Printable p = new Test( );
		p.print();	//Dynamic method dispatch
	}
}
