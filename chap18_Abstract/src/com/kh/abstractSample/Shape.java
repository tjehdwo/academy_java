package com.kh.abstractSample;
//추상클래스 정의
abstract class Shape {
	private String color;
	
	//추상 메서드 (하위 클래스에서 구현해야 함)
	abstract double calculateArea();
	
	//생성자
	public Shape(String c) {
		this.color = c;
	}
	
	//일반 메서드
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	public static void main(String[] args) {
		//일반 필드
		
	}

}
