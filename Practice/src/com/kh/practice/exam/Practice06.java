package com.kh.practice.exam;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����ڷκ��� �� ���� ���� �Է� �޾�
		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
		int start = sc.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է����ּ��� :");
		int end = sc.nextInt();
		
		//�� ������ ���ڸ� ��� ���
		System.out.println(start + "����"+ end + "���� ����");
		for (int i = start; i<= end;i++);{
			System.out.println(i);
		}

	}

}
