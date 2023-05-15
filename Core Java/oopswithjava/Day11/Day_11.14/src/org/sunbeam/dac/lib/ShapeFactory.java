package org.sunbeam.dac.lib;
public class ShapeFactory{
	public static Shape getInstance( ShapeType choice ) {
		Shape shape = null;
		switch( choice ) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		}
		return shape;
	}
}
