package com.kh.practice.exam;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����ڷκ��� �� ���� ���� �Է� �޾�
		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
		int start = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ��� :");
		int end = sc.nextInt();
		
		/*Scanner sc = new Scanner(System.in);
		//����ڷκ��� �� ���� ���� �Է� �޾�
		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
		int firstNumber = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ��� :");
		int secondNumber = sc.nextInt();
		
		int start = Math.min(firstNumber, secondNumber);
		int end =Math.max(firstNumber, secondNumber);*/
		
		//math �ڹ��� ���� Ŭ����
		//min (���� ���� ��) �־��� �ΰ��� ���� �߿��� �� ���� ���� ��ȯ
		//max (���� ū ��) �־��� �ΰ��� ���� �߿��� �� ū ���� ��ȯ
		int a = 5;
		int b = 8;
		int minValue = Math.min(a,b);
		System.out.println(minValue);
		int maxValue = Math.max(a,b);
		System.out.println(maxValue);
		
		int reStart = end;//end�� start���� ���� �� reStart�� �־��ش�
		int reEnd = start;//start�� end���� Ŭ �� reEnd�� �־��ش�
		System.out.println(start + "����"+ end + "���� ����");
		
		if (reEnd < reStart) {
		
			for (int i = start; i<=end;i++) {
				System.out.println(i);
			}
		}else if (reStart < reEnd) {
			for(int i = reStart; i<= reEnd; i++) {
				System.out.println(i);
			}
			
		}
	}

}
