package org.sunbeam.dac.test;

public class EmployeeTest {
	public void f3( ) {
		//System.out.println("EmployeeTest.X	:	"+x);//NOT OK
		Person p = new Person();
		System.out.println("EmployeeTest.X	:	"+p.x);//OK
	}
}
