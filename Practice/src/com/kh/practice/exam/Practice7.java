package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		boolean isTrue = true;//1. ���� �� ����� boolean ���� = true of false;
		while(isTrue) {//2. ���� �߰��ϱ�
			if(num < 1) {//���� 1 �̸��� ���ڰ� �Է�
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		
		} else {//1 �̻��� ���ڵ�
			for (int i = 1; i<=num; i++) {
				System.out.println(i);
}//3.false �����
			isTrue = false;
			break;//if�� switch���� ��� �� �� �ִ�.
			}
			}
		}
	}