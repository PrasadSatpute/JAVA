package org.sunbeam.dac.lib;

public abstract class Shape{
	protected float area;
	
	public abstract void calculateArea( );
	
	public final float getArea() {
		return this.area;
	}
	
}