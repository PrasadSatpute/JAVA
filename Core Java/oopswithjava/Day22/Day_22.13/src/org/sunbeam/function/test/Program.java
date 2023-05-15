package org.sunbeam.function.test;

@FunctionalInterface
interface Printable {
	void print();	//Functional method / Method Descriptor
}

public class Program {
	public static void test( Printable p ) {
		if( p != null )
			p.print();
	}
	public static void main(String[] args) {
		Program.test( ( ) -> System.out.println("Hello Lambda Expression") ); //Behavior Parameterization
	}
	public static void main3(String[] args) {
		Printable p = ( ) -> System.out.println("Hello Lambda Expression");
		p.print();
	}
	public static void main2(String[] args) {
		Printable p = ( ) -> {	
			System.out.println("Hello Lambda Expression");
		};
		p.print();
	}
	public static void main1(String[] args) {
		Printable p = ( ) -> {	
			String message = "Hello Lambda Expression";
			System.out.println(message);
		};
		p.print();
	}
}
