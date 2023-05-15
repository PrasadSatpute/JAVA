package org.sunbeam.dac.test;

import java.util.Date;

class Box{
	private Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
public class Program {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject(new Date( ));
		String str = (String) b1.getObject(); //ClassCastException
		System.out.println(str);
	}
}
