package org.sunbeam.dac.test;

import java.util.Date;
//Class Box is called parameterized type
class Box<T>{	// T : is type parameter
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		//Box<int> b1 = new Box<>();	//Not OK
		
		Box<Integer> b1 = new Box<>();	//OK
		b1.setObject(10);	//b1.setObject(Integer.valueOf( 10) );
		int value = b1.getObject();	//int value = b1.getObject().intValue();
	}
	public static void main3(String[] args) {
		Box b1 = new Box();	//class Box : Raw Type
		//Box<Object> b1 = new Box<Object>();
		b1.setObject("SunBeam");
		String str = (String) b1.getObject();
		System.out.println(str);
	}
	public static void main2(String[] args) {
		
		//Box<Date> b1 = new Box< >();	// OK : Type inference
		//Instance will infered type from refernce declaration
		
		//Box< > b1 = new Box< Date >();	// NOT OK
		
		//Box<Object> b1 = new Box<Date>();	// NOT OK
		
		Box<Date> b1 = new Box<Date>();	//OK
		
		b1.setObject( new Date() );
		
		Date date = b1.getObject();
		
		System.out.println( date );
	}
	public static void main1(String[] args) {
		Box<Date> b1 = new Box<Date>();	//Date is Type Argument
		
		b1.setObject( new Date() );
		
		//String str = (String) b1.getObject(); //Error
		
		Date date = b1.getObject();
		
		System.out.println( date );
	}
}
