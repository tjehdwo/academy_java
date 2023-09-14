package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.NumFormatException();
		//pm.ArithException();
		pm.NPException();
	}
	public void ArithException() {
		try {
		// int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		int result = dividend/ divisor;
		} catch(ArithmeticException e) {
			System.out.println("산술 연산 오류 입니다." + e.getMessage());
			
		}
		
	}
	
	public void NPException() {
		try {
		String text = "Hello World";
		String subText = null;
		int length = text.indexOf(subText);
		System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("subText의 값이 null 입니다." + e.getMessage());
		}
		
	}
	
	public void NumFormatException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해 주세요." + e.getMessage());
		}
	}
}
