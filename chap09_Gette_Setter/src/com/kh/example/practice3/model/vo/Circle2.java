package com.kh.example.practice3.model.vo;

public class Circle2 {
	private double Pi =3.14;
	private int radius = 1;
	
	public double getPi() {
		return Pi;
	}
	public int getRadius() {
		return radius;
	}
	public void setPi(double pi) {
		Pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCricle() {
		double area = Pi*radius*radius;
		System.out.println("원의 넓이 : "+ area);
	}
	public void getSizeOfCircle() {
		System.out.println("원의 크기(반지름)은 :" + radius);
		
	}
}
