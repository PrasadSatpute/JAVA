package org.sunbeam.dac.test;
import java.text.SimpleDateFormat;
import java.util.Date;

class Box{
	private Object object;	//null
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Program {
	public static void main(String[] args) {
		Object obj = new String( );
		String str = (String) obj;
	}
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject(new Date()); //Upcasting
		String str = (String) b1.getObject(); //Downcasting : ClassCastException
	}
	public static void main4(String[] args) {
		Box b1 = new Box();
		b1.setObject(new Date()); //Upcasting
		Date date = (Date) b1.getObject(); //Downcasting
		System.out.println(toString(date));
	}
	public static void main3(String[] args) {
		Box b1 = new Box();
		b1.setObject(123);	//b1.setObject( Integer.valueOf(123) );
		//Integer number = (Integer) b1.getObject(); //Downcasting
		int number = (Integer) b1.getObject(); //Downcasting : Auto-Unboxing
		System.out.println(number);
	}
	public static void main2(String[] args) {
		Box b1 = new Box();
		System.out.println(b1.getObject());	//null
	}
	public static String toString( Date date ) {
		return new SimpleDateFormat("dd MMMM,yyyy").format(date);
	}
	public static void main1(String[] args) {
		Object obj1 = 10;	//Object obj = Integer.valueOf( 10 );
		
		Object obj2 = new String( "SunBeam");
		
		Object obj3 = new Date();
	}	
}
