package org.sunbeam.dac.test;
abstract class A{
	public abstract void f3( );
}
class B extends A{
	@Override
	public void f3() {
		System.out.println("B.f3");
	}
}
abstract class C extends A{
	
}
public class Program {
	public static void main(String[] args) {
		
	}
	public static void main2(String[] args) {
		A a = new B( );
		a.f3();
	}
	public static void main1(String[] args) {
		A a = null;	//OK
		
		//a = new A( );//Cannot instantiate the type A
	}
}