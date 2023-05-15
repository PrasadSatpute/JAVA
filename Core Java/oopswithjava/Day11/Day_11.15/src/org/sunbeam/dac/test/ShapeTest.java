package org.sunbeam.dac.test;
import java.util.Scanner;
import org.sunbeam.dac.lib.*;

public class ShapeTest{
	private Shape shape;
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		if( this.shape != null ) {
			if( shape instanceof Rectangle ) {
				Rectangle rect = (Rectangle) shape;	//Downcasting
				System.out.print("Length	:	");
				rect.setLength(sc.nextFloat());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextFloat());
			}
			else {
				Circle c = (Circle) shape;	//Downcasting
				System.out.print("Radius	:	");
				c.setRadius(sc.nextFloat());
			}
			this.shape.calculateArea();//DMD
		}
	}
	public void printRecord( ) {
		if( this.shape != null )
			System.out.println("Area	:	"+shape.getArea());
	}
	public static ShapeType menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return ShapeType.values()[ sc.nextInt() ];
	}
}
