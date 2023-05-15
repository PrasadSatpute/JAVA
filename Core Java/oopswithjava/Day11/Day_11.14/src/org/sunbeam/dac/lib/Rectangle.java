package org.sunbeam.dac.lib;
public class Rectangle extends Shape{
	private float length;
	private float breadth;
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
