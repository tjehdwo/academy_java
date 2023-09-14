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
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		int result = dividend/ divisor;
		} catch(ArithmeticException e) {
			System.out.println("��� ���� ���� �Դϴ�." + e.getMessage());
			
		}
		
	}
	
	public void NPException() {
		try {
		String text = "Hello World";
		String subText = null;
		int length = text.indexOf(subText);
		System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("subText�� ���� null �Դϴ�." + e.getMessage());
		}
		
	}
	
	public void NumFormatException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��� �ּ���." + e.getMessage());
		}
	}
}
