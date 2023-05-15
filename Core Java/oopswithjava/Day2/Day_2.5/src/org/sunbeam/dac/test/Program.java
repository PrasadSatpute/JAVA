package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		Integer i = new Integer( 125 );
		String str = i.toString();
		System.out.println("Number	:	"+str);
		
		System.out.println("Number	:	"+i.toString());
		
		System.out.println("Number	:	"+i);
		
		System.out.println(i);	//System.out.println(String.valueOf(i));
	}
	public static void main7(String[] args) {
		int num1 = 125;
		String s1 = String.valueOf(num1);	//Boxing
		
		float num2 = 12.34f;
		String s2 = String.valueOf(num2);	//Boxing
		
		double num3 = 123.45d;
		String s3 = String.valueOf(num3);	//Boxing
		
		
		Integer i = new Integer(num1);	//Boxing
	}
	public static void main6(String[] args) {
		char ch = Integer.toString(1).charAt(0);
		System.out.println(ch);
	}
	public static void main5(String[] args) {
		int num1 = 125;
		String s1 = Integer.toString(num1);	//Boxing
		
		float num2 = 12.34f;
		String s2 = Float.toString(num2);	//Boxing
		
		double num3 = 123.45d;
		String s3 = Double.toString(num3);	//Boxing
	}
	public static void main4(String[] args) {
		//int : primitive type
		int number = 125;
		//String : non primitive type
		String str = Integer.toString(number);
		System.out.println( str );	//Boxing
	}
	public static void main3(String[] args) {
		//Date 
		//struct Date dt1;	//C : Static Memory allocation
		//struct Date *ptr = (struct Date*) malloc( sizeof( struct Date ));  //C : Dynamic Memory alloaction
		
		
		//class Date dt1;	//OK : Static memory allocation
		//Date dt2;	//OK : Static memory allocation
		//Date *ptr = new Date( );	//C++ : Dynamic Memory Allocation
		
		//Date dt1;	//Object reference / reference
		//new Date( );	//Instance
		//Date dt = new Date( );	//Java : Dynamic meory allocation
		
		Integer i = new Integer(125); 
	}
	public static void main2(String[] args) {
		//Integer : Non Primitive Type
		Integer i = new Integer("125");
		
		//int : primtive type
		int number = i.intValue();	//UnBoxing
		System.out.println("Number	:	"+number);
	}
	public static void main1(String[] args) {
		//String : not primitive type
		String str = "125";	
		
		//int : primitive type
		int num1 = Integer.parseInt(str);	//UnBoxing
	}
}


