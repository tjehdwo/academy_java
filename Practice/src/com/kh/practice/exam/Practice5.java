package com.kh.practice.exam;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			sum += i;
			System.out.println("1����"+num + "������ �������� ����"+sum);
		}

	}

}
