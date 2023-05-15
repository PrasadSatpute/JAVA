package org.sunbeam.dac.test;

import org.sunbeam.dac.lib.Shape;
import org.sunbeam.dac.lib.ShapeFactory;
import org.sunbeam.dac.lib.ShapeType;

public class Program {
	public static void main(String[] args) {
		ShapeType choice;
		ShapeTest test = new ShapeTest();
		while( ( choice = ShapeTest.menuList( ) ) != ShapeType.EXIT ) {
			Shape shape = ShapeFactory.getInstance(choice);
			test.setShape(shape);
			test.acceptRecord();
			test.printRecord();
		}
	}
}
