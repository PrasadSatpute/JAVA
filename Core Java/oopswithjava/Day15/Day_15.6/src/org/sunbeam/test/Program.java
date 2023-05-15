package org.sunbeam.test;

interface A{
	void f1( );
	void f4( );
}
interface B{
	void f2( );
	void f4( );
}
abstract class C {
	public abstract void f3( );
	public abstract void f4( );
}
class D extends C implements A, B{
	@Override
	public void f1() {
		System.out.println("D.f1");
	}
	@Override
	public void f2() {
		System.out.println("D.f2");
	}
	@Override
	public void f3() {
		System.out.println("D.f3");
	}
	@Override
	public void f4() {
		System.out.println("D.f4");
	}
}
public class Program {
	public static void main3(String[] args) {
		C c = new D( );
		c.f3();
		c.f4();
	}
	public static void mai2(String[] args) {
		B b = new D( );
		b.f2();
		b.f4();
	}
	public static void main1(String[] args) {
		A a = new D( );
		a.f1();
		a.f4();
	}
}
