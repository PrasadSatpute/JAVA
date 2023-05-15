package org.sunbeam.dac.test;
abstract class A{
	public abstract void f1( );
	public abstract void f2( );
	public abstract void f3( );
}
abstract class B extends A{
	@Override
	public void f1() {	}
	@Override
	public void f2() {	}
	@Override
	public void f3() {	}
}
class C extends B{
	@Override
	public void f1() {
		System.out.println("C.f1");
	}
}
class D extends B{
	@Override
	public void f2() {
		System.out.println("D.f2");
	}
}
class E extends B{
	@Override
	public void f3() {
		System.out.println("E.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B( );
		b.f1();
		b.f2();
		b.f3();
		
		A a1 = new C( );	//Upcasting
		a1.f1();
		
		A a2 = new D( );	//Upcasting
		a2.f2();
		
		A a3 = new E( );	//Upcasting
		a3.f3();
	}
}