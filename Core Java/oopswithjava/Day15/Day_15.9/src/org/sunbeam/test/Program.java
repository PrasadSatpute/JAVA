package org.sunbeam.test;

interface Printable{
	void print( );
}
class Date implements Printable{
	private int day, month, year;
	public void print( ) {
		System.out.println(this.day+" / "+this.month+" / "+this.year);
	}
}
class Address implements Printable{
	private String cityName, stateName, pinCode;
	public void print( ) {
		System.out.println(this.cityName+" "+this.stateName+" "+this.pinCode);
	}
}
class Complex implements Printable{
	private int real, imag;
	public void print( ) {
		System.out.println(this.real+" "+this.imag);
	}
}
public class Program {
	public static void main(String[] args) {
		Printable[] arr = new Printable[ 3 ];
		arr[ 0 ] = new Date( );
		arr[ 1 ] = new Address( );
		arr[ 2 ] = new Complex( );
	}
	public static void main1(String[] args) {
		Printable p = null;
		
		//case 1
		p = new Date( );	//Upcasting
		
		//case 2
		p = new Address();	//Upcasting
		
		//case 3
		p = new Complex( );	//Upcasting
		
		p.print();
		
	}
}
