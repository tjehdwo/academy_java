package com.kh.exceptionSample;

import java.util.Scanner;

public class ThrowMain {
/*
 * throw
 * ���ܸ� �߻���Ű�� Ű����
 * ���α׷� ���� �� ����ġ ���� ��Ȳ�� �߻����� �� ���
 * ���ܸ� �߻���Ű�� ���� ó���� ���۵ǰ�
 * ���α׷��� �ش� ���ܸ� ������ ó���ϰų� ���� ȣ�� ���� ���ܸ� ����
 * 
 * user ���ڸ� �Է��ؾ���
 * ����� �Է��ؾ��ϴµ� ������ �Է���
 * ������ ��� ���ܸ� �߻���Ű�� ������ ����
 * 
 * 
 * */
	
	public static void main(String[] args) {
		try {
			int number = getNumber();//���ڸ� ������ ��
			if (number < 0 ) {
				throw new NegativeNumberException ("������ ����� ���� �ʽ��ϴ�.");
			}
			System.out.println("�Է��� ���� : " + number);
		}catch(NegativeNumberException e) {
			System.out.println("���� �߻�!!!" + e.getMessage);
			
		}
	}

	public static int getNumber() {
		//���⿡�� ������ �Է��ϸ� ���ܰ� �߻��� ��!!!
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		//����ڷκ��� ���ڸ� �Է¹޴� �޼���
		return number;
	}
}


