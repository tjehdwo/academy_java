package com.kh.practice.exam;

import java.util.Scanner;

public class Practice1 {
	/*����ڷκ��� �� ���� ���� �Է¹޾� 1���� �׼��ڱ����� ���ڵ��� ����ϼ���
	 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");//�� ���� ���� �Է� �޴´�
		int num = sc.nextInt();//����ڷκ��� �Է¹��� �� �ִ� ����
		
		if(num<1) {//1�̸� ���� �Է� "1 �̻��� ���ڸ� �Է����ּ���." ���
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");	
		} else {//1 �̻��� ���ڸ� ���´�.
			//1���� �׼��ڱ����� ���ڵ��� ��� ����ϼ���.
			int i = 0;
			for (i = 1; i<=num; i++);{
				System.out.println("�����");

			}

		}
		

	}

}
