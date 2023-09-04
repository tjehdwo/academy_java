package com.kh.example.practice3.model.vo;

public class Circle {
	double Pi = 3.14;
	int radius = 1;
	
	
	public Circle() {
		
	}
	
	
	
	public void incrementRadius() {
		radius++;
		System.out.println("radius :"+ radius);
		
	}
	public void getAreaOfCircl() {
		 double area = Pi*radius*radius;
		System.out.println("area :" + area);
		
	}
    public void getSizeOfCircle() {
    	 double size = Pi*2*radius;
    	System.out.println("size :"+ size);
    	
    }
}
