package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		
		if(num < 1) {//���� 1 �̸��� ���ڰ� �Է�
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {//1 �̻��� ���ڵ�
			for (int i = 1; i<=num; i++) {
				System.out.println(i);
			}
		}
	}

}


/* ����ڷκ��� �Ѱ��� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
 * �ƴٸ�"1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���. 
 */