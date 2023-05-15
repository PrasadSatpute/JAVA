package org.sunbeam.test;

interface A{
	default void f1( ) {
		System.out.println("A.f1");
	}
	default void f3( ) {
		System.out.println("A.f3");
	}
}
interface B{
	default void f2( ) {
		System.out.println("A.f2");
	}
	default void f3( ) {
		System.out.println("B.f3");
	}
}
class C implements A, B{
	@Override
	public void f3() {
		System.out.println("C.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new C( );
		a.f1();
		a.f3();
		System.out.println("*******************");
		B b = new C( );
		b.f2();
		b.f3();
	}
}
