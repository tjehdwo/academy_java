package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���ڸ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		char inputChar = sc.next().charAt(0);//�Է¹��� ���� ���
		
		int changeChar = inputChar;
		System.out.println("�Է¹��� : "+ inputChar + "�����ڵ� : "+ changeChar);
	}

}
