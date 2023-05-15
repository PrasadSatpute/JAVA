package org.sunbeam.test;

abstract class Shape{
	protected float area;
	public abstract void calculateArea( );
}
class Rectangle extends Shape{
	private float length = 10;
	private float breadth = 20;
	public void calculateArea( ) {
		this.area = length * breadth;
	}
}
class Circle extends Shape{
	private float radius = 10;
	public void calculateArea( ) {
		this.area = (float) (Math.PI *  Math.pow(radius, 2));
	}
}
class Triangle extends Shape {
	private float base = 10;
	private float height = 20;
	public void calculateArea( ) {
		this.area = (float) (0.5 * base * height);
	}
}
public class Program {
	public static void main(String[] args) {
		Shape sh1 =  new Rectangle();
		Shape sh2 =  new Circle();
		Shape sh3 =  new Triangle();
		
		Shape[] arr = new Shape[ 3 ];
		arr[ 0 ] =  new Rectangle();
		arr[ 1 ] =  new Circle();
		arr[ 2 ] =  new Triangle();
		
	}
	public static void main2(String[] args) {
		Rectangle[] arr = new Rectangle[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Rectangle();
	}
	public static void main1(String[] args) {
		Shape shape = null;
		
		//case 1
		shape = new Rectangle();	//Upcasting
		
		//case 2
		shape = new Circle();
		
		//case 3
		shape = new Triangle();
		
		shape.calculateArea( );
		
	}
}
