package com.kh.mvc.circle.mo;

public class CircleModel {
	private final double PI = 3.14;
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double AreaCircle() {
		return PI*radius*radius;
	}
	

}
