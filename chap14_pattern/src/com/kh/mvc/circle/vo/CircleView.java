package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {
	
	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		return sc.nextDouble();
	}
	public void displayResult(double result) {
		System.out.println("��� : "+ result);
	}

}
