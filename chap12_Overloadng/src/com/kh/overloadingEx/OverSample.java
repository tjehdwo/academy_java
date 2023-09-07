package com.kh.overloadingEx;

public class OverSample {
	
	public int multiply(int a,int b) {
		return a*b;
	}
	
	public int multiply(int a,int b, int c) {
		return a*b*c;
	}
	
	public int multiply(int a, int b, int c,int d) {
		return a*b*c*d;
	}
	
	public double multiply(double a,double b) {
		return a*b;
	}
	
	public double multiply(double a,double b ,double c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		
		OverSample obj = new OverSample();
		
		System.out.println("두 정수의 곱 : " + obj.multiply(5, 10));
		System.out.println("세 정수의 곱 : " + obj.multiply(5, 10, 15));
		System.out.println("네 정수의 곱 : " + obj.multiply(5, 10, 15, 20));
		System.out.println("두 실수의 곱 : " + obj.multiply(1.5, 3.5));
		System.out.println("세 실수의 곱 : " + obj.multiply(1.5, 3.5, 5.5));

	}

}
