package org.sunbeam.dac.test;
class A{
	int num1 = 10;
}
class B extends A{
	int num2 = 20;
}
public class Program {
	public static void main(String[] args) {
		A a = new B( );	//Upcasting
		System.out.println(a.num1);
		//System.out.println(a.num2); //Not allowed
		
		B b = (B) a;	//Downcasting
		System.out.println(b.num2); //OK
	}
}
