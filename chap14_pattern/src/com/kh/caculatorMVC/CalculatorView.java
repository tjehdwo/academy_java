package com.kh.caculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	//Ŭ���̾�Ʈ�� ���� ��
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		return sc.nextInt();
	}
	//���� ���
	public void displayResult(int result) {
		System.out.println("��� : "+ result);
	}
}
