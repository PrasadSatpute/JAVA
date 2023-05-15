package org.sunbeam.dac.lib;
public class Circle extends Shape{
	private float radius;
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
