package com.kh.abstractSample;
//Rectangle r = new Rectangle("Blue",4.0,6.0);
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle(String color,double width,double length) {
		super(color);
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double calculateArea() {
		return width*length;
	}



}
