package org.sunbeam.test;
class A{
	class B{
		public void sum( int num1, int num2 ) {
			System.out.println("Sum	:	"+( num1 + num2 ));
		}
		public void sum( int num1, int num2, int num3 ) {
			System.out.println("Sum	:	"+( num1 + num2 + num3 ));
		}
	}
}
public class Program {
	public static void main(String[] args) {	
		A.B b = new A().new B();
		b.sum(10, 20);
		b.sum(10, 20, 30);
	}
}
