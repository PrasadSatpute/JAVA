package org.sunbeam.test;

interface A{
	void f1( );
	void f2( );
	void f3( );
}
abstract class B implements A{
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
		System.out.println("C.f2");
	}
}
class E extends B{
	@Override
	public void f3() {
		System.out.println("C.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new E( );
		a.f3();
	}
	public static void main2(String[] args) {
		A a = new D( );
		a.f2();
	}
	public static void main1(String[] args) {
		A a = new C( );
		a.f1();
	}
}
