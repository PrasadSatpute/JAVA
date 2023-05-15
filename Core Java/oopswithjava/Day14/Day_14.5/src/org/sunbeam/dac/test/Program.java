package org.sunbeam.dac.test;

import java.util.Date;

class Box<T extends Number>{	// T : is bounded type parameter
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
		//Box<Boolean> b1 = new Box<>( );	//Not Valid
		
		//Box<Character> b2 = new Box<>( );	//Not Valid
		
		Box<Number> b3 = new Box<>( );	//Valid
		
		Box<Integer> b4 = new Box<>( );	//Valid
		
		Box<Double> b5 = new Box<>( );	//Valid
		
		//Box<String> b6 = new Box<>( );	//Not Valid
		
		//Box<Date> b7 = new Box<>( );	//Not Valid
	}
}
